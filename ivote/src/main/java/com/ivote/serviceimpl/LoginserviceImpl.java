package com.ivote.serviceimpl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ivote.bean.Admin;
import com.ivote.dao.AdminDao;
import com.ivote.dao.LoginDao;
import com.ivote.service.LoginService;
import com.ivote.utils.Email;
import com.ivote.utils.PasswordEncode;
import com.ivote.utils.PasswordEncrypt;
import com.ivote.utils.RandomString;

@Service("loginService")
@Transactional
@SessionAttributes("admin")
public class LoginserviceImpl implements LoginService {
	@Autowired
	LoginDao loginDao;

	@Autowired
	HttpSession session;

	public Admin login(Admin admin) {
		String password = admin.getPassword();
		admin.setPassword(PasswordEncode.passwordEncode(password));

		return loginDao.logincheck(admin);
	}

	public Admin forgotPassword(Admin admin) {

		Admin u = loginDao.forgotpassword(admin);
		if (u.getPassword() != null) {

			int n = 8;
			String password = RandomString.getAlphaNumericString(n);
			u.setPassword(PasswordEncode.passwordEncode(password));

			loginDao.updateObject(u);
			Email.send("healthplus123456@gmail.com", "he@lthplus123", admin.getEmail(), "Hello,How r u?", password);
		}
		return u;

	}

	public String changePassword(String oldpassword, String npass) {

		Admin admin = (Admin) session.getAttribute("admin");
		oldpassword = PasswordEncode.passwordEncode(oldpassword);
		String msg = "";
		if (oldpassword.equals(admin.getPassword())) {
			String encNewPass = PasswordEncode.passwordEncode(npass);
			int result = loginDao.changePass(encNewPass, admin.getAdminId());
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

}
