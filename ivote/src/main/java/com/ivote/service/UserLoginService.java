package com.ivote.service;

import com.ivote.bean.Admin;
import com.ivote.bean.Voter;

public interface UserLoginService {

	public Voter login(Voter voter);

	public Voter forgotPassword(Voter voter);

	public String changePassword(String oldpassword,String npass);
	
	public boolean isEmailExist(String email);
	public boolean isNiExist(String email);
	public boolean valOTP(int otp, long id);


}
