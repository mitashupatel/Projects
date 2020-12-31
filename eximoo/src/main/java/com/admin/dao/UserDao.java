package com.admin.dao;

import java.util.List;


import com.admin.model.User;

public interface UserDao extends GenericDAO<User>{
 
	public long saveUpdateUser(User user);
	public User editUser(long userid);
	public boolean deleteUser(long userid);
	public List<User> getAll();
	public User logincheck(User user);
	public List<User> getIdList();
	public User forgotpassword(User user);
	public int changePass(String newPassword, long id);
	public int updatePass(String oldpassword, String newpassword);
	public boolean isEmailExist(String email);
}
