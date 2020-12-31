package com.mitashu.dao;

import java.util.List;

import com.mitashu.model.User;

public interface UserDao {
	public List<User> getAll();

	public long saveUser(User user);
	public User edituser(int id);

	public int deleteUser(int id);
}
