package com.admin.serviceimpl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.admin.dao.NewsLetterDao;
import com.admin.dao.OtpDao;
import com.admin.dao.UserDao;
import com.admin.model.NewsLetter;
import com.admin.model.Otp;
import com.admin.model.User;
import com.admin.service.UserService;
import com.admin.utills.Email;
import com.admin.utills.FTPUtils;
import com.admin.utills.FileUtils;
import com.admin.utills.Mailer;
import com.admin.utills.RandomString;

@Service("userService")
@Transactional
@SessionAttributes("user")
public class UserServiceImpl implements UserService {

	@Autowired
	NewsLetterDao newsletterDao;
	@Autowired
	UserDao userDao;
	@Autowired
	OtpDao otpDao;
	@Autowired
	HttpSession session;
	private static String UPLOADED_FOLDER1 = "F://Tools//apache-tomcat-9.0.30-windows-x64//apache-tomcat-9.0.30//webapps//eximoo//resources//images//user//";

	public long saveUpdateUser(User user, MultipartFile file) {
		String newFileName = FileUtils.getFileName(file.getOriginalFilename());
		long userId = 0;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		user.setUserphoto(newFileName);
		/*
		List<User> idList = userDao.getIdList();
		int i =user.getUserid();
		for (Object temp : idList) {
			long id = (Long) temp;
			switch(i){
			case id:
				user.setModifyDate(formatter.format(date));
				break;
			default:
				user.setCreatedDate(formatter.format(date));
			}
			if (user.getUserid() == id) {
				
				user.setModifyDate(formatter.format(date));
			}
			else {
				user.setCreatedDate(formatter.format(date));
			}
		}*/

		user.setIsActive(1);
		userId = userDao.saveUpdateUser(user);
				
		if (user != null) {
			FileUtils.uploadImageFile(file, UPLOADED_FOLDER1 + newFileName);
			FTPUtils.uploadOnFTP(UPLOADED_FOLDER1 + newFileName, newFileName);
		}

		NewsLetter newsletter = new NewsLetter();
		String usermail = user.getEmail();
		int i = user.getNewsletter();
		newsletter.setEmail(usermail);
		if (i == 1) {
			long result2 = newsletterDao.saveNewsLetter(newsletter);
		}

		return userId;
	}

	public User editUser(long userid) {
		return userDao.editUser(userid);
	}

	public boolean deleteUser(long userid) {
		return userDao.deleteUser(userid);
	}

	public List<User> getAll() {
		List<User> UserList = userDao.getAll();
		/*
		 * for (User User:UserList) { String fileName = User.getUserphoto(); File file =
		 * new File(UPLOADED_FOLDER1+fileName); if(!file.exists()) {
		 * FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName); } }
		 */
		return UserList;
	}

	public long login(User user) {
		String password = user.getPassword();
		user.setPassword(password);

		User result = userDao.logincheck(user);
		if (result != null) {
			String msg = RandomString.getNumericString(4);
			Long otp= Long.parseLong(msg);
			Mailer.send("eximoohello@gmail.com", "eximoo123@", user.getEmail(),
					"Here is your OTP. To continue login Enter this OTP.", msg);
             Otp otp1 = new Otp();
             otp1.setOtp(otp);
             long otpId = otpDao.addOtp(otp1);
     		
			return otpId;

		} else {
			return 0;
		}
	}

	
	public User forgotPassword(User user) {

		User u = userDao.forgotpassword(user);
		if (u.getPassword() != null) {

			int n = 8;
			String password = RandomString.getAlphaNumericString(n);
			u.setPassword((password));

			userDao.updateObject(u);
			Email.send("eximoohello@gmail.com", "eximoo123@", user.getEmail(), "Eximoo Reset Password", password);
		}
		return u;

	}

	public String changePassword(String oldpassword, String npass) {

		User user = (User) session.getAttribute("user");
		
		String msg = "";
		if (oldpassword.equals(user.getPassword())) {
			String encNewPass = npass;
			int result = userDao.changePass(encNewPass, user.getUserid());
			if (result > 0) {
				msg = "Successful updated";
			} else {
				msg = "Something goes to wrong";
			}
		} else {
			msg = "old password is wrong";
		}
		return msg;
	}
	
	public boolean isEmailExist(String email) {
		return userDao.isEmailExist(email);
	}

	
}
