package com.mitashu.seviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitashu.dao.UserDao;
import com.mitashu.model.User;
import com.mitashu.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	public long saveUpdateUser(User user) {
		long userId=0;
		user.setIsActive(1);
		userId = userDao.saveUpdateUser(user);
		return userId;
	}

	public User editUser(long userId) {
		return userDao.editUser(userId);
	}

	public boolean deleteUser(long userId) {
		return userDao.deleteUser(userId);
	}

	public List<User> getAll() {
		List<User> UserList = userDao.getAll();
		return UserList;
	}

}
