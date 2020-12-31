package com.admin.serviceimpl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.admin.dao.LoginDao;
import com.admin.model.Admin;
import com.admin.service.LoginService;
import com.admin.utills.PasswordEncode;

@Service("loginService")
@Transactional
@SessionAttributes("admin")
public class LoginServiceImpl implements LoginService {
		
	@Autowired
	LoginDao loginDao;

	@Autowired
	HttpSession session;
	
	public Admin login(Admin admin) {
		String password = admin.getPassword();
		admin.setPassword(PasswordEncode.passwordEncode(password));

		return loginDao.logincheck(admin);
	
	}
	
	
}
