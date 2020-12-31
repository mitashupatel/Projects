package com.admin.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.admin.model.User;


public interface UserService {

	public long saveUpdateUser(User user, MultipartFile files);
	public User editUser(long userid);
	public boolean deleteUser(long userid);
	public List<User> getAll();
	public long login(User user);
	public User forgotPassword(User user);
	public String changePassword(String oldpassword,String npass);
	public boolean isEmailExist(String email);
}