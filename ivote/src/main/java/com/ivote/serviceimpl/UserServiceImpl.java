package com.ivote.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ivote.bean.Admin;
import com.ivote.bean.User;
import com.ivote.dao.AdminDao;
import com.ivote.dao.UserDao;
import com.ivote.service.UserService;
import com.ivote.utils.Mailer;
import com.ivote.utils.PasswordEncode;
import com.ivote.utils.RandomString;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	public long saveUpdateUser(User user) {
		long userId = 0;
		user.setIsActive(1);
		if (user.getUserId() == 0) {
			String password = RandomString.getAlphaNumericString(8);
			user.setPassword(PasswordEncode.passwordEncode(password));
			userId = userDao.saveUpdateUser(user);
			if (userId > 0) {
				Mailer.send("healthplus123456@gmail.com", "he@lthplus123", user.getEmail(), "Hello..!!!", password);
			}
		} else {
			userId = userDao.saveUpdateUser(user);
		}
		return userId;
	}

	public User editUser(long aid) {
		return userDao.editUser(aid);
	}

	public boolean deleteUser(long aid) {
		return userDao.deleteUser(aid);
	}

	public List<User> getAll() {
		return userDao.getAll();
	}
}
