package com.admin.dao;

import com.admin.model.Otp;
import com.admin.model.User;

public interface OtpDao extends GenericDAO<Otp>{
	public long addOtp(Otp otp);
	public Otp varifyOtp(Otp otp);
}
