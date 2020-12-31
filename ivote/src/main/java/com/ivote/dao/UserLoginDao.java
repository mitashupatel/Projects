package com.ivote.dao;

import com.ivote.bean.Admin;
import com.ivote.bean.User;
import com.ivote.bean.Voter;

public interface UserLoginDao extends GenericDAO<Voter> {

	public Voter logincheck(Voter voter);

	public Voter forgotpassword(Voter voter);

	public int changePass(String newPassword, long id);

	public int updatePass(String oldpassword, String newpassword);

	public boolean isEmailExist(String email);
	
	public boolean isNiExist(String ni);

	public boolean valOTP(int otp, long id);

}
