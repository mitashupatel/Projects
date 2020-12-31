package com.ivote.serviceimpl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ivote.bean.Admin;
import com.ivote.bean.Voter;
import com.ivote.dao.AdminDao;
import com.ivote.dao.LoginDao;
import com.ivote.dao.UserLoginDao;
import com.ivote.dao.VoterDao;
import com.ivote.service.LoginService;
import com.ivote.service.UserLoginService;
import com.ivote.utils.Email;
import com.ivote.utils.PasswordEncode;
import com.ivote.utils.PasswordEncrypt;
import com.ivote.utils.RandomString;

@Service("userLoginService")
@Transactional
@SessionAttributes("user")
public class UserLoginserviceImpl implements UserLoginService {
	
	@Autowired
	UserLoginDao userLoginDao;
	
	@Autowired
	HttpSession session;

	public Voter login(Voter voter) {
		String password = voter.getPassword();
		voter.setPassword(PasswordEncode.passwordEncode(password));

		return userLoginDao.logincheck(voter);
	}

	public Voter forgotPassword(Voter voter) {

		Voter u = userLoginDao.forgotpassword(voter);
		if (u.getPassword() != null) {

			int n = 8;
			String password = RandomString.getAlphaNumericString(n);
			u.setPassword(PasswordEncode.passwordEncode(password));

			userLoginDao.updateObject(u);
			Email.send("healthplus123456@gmail.com", "he@lthplus123", voter.getEmail(), "Hello,How r u?", password);
		}
		return u;

	}

	public String changePassword(String oldpassword, String npass) {

		Voter voter = (Voter) session.getAttribute("user");
		oldpassword = PasswordEncode.passwordEncode(oldpassword);
		String msg = "";
		if (oldpassword.equals(voter.getPassword())) {
			String encNewPass = PasswordEncode.passwordEncode(npass);
			int result = userLoginDao.changePass(encNewPass, voter.getVoterId());
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
		return userLoginDao.isEmailExist(email);
	}

	public boolean isNiExist(String ni) {
		return userLoginDao.isNiExist(ni);
	}

	public boolean valOTP(int otp, long id) {
		return userLoginDao.valOTP(otp, id);
	}
}
