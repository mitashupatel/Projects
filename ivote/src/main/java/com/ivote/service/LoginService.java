package com.ivote.service;

import com.ivote.bean.Admin;

public interface LoginService {

	public Admin login(Admin admin);

	public Admin forgotPassword(Admin admin);

	public String changePassword(String oldpassword,String npass);


}
