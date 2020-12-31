package com.mitashu.serviceimpl;

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
	
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	public long saveUser(User user) {
		// TODO Auto-generated method stub
		return userDao.saveUser(user);
	}

	public User edituser(int id) {
		// TODO Auto-generated method stub
		return userDao.edituser(id);
	}

	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(id);
	}

}
