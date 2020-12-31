package com.mitashu.dao;

import java.util.List;

import com.mitashu.model.User;

public interface UserDao extends GenericDAO<User>{
	
public long saveUpdateUser(User user);
	
	public User editUser(long userId);
	
	public boolean deleteUser(long userId);
	
	public List<User> getAll();
}
