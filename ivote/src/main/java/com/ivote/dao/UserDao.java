package com.ivote.dao;

import java.util.List;

import com.ivote.bean.Admin;
import com.ivote.bean.User;

public interface UserDao extends GenericDAO<User>{

	public long saveUpdateUser(User user);

	public User editUser(long id);

	public boolean deleteUser(long id);

	public List<User> getAll();
	
	
}
