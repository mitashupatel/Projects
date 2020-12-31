package com.ivote.dao;

import com.ivote.bean.Admin;

public interface LoginDao extends GenericDAO<Admin> {

	public Admin logincheck(Admin admin);

	public Admin forgotpassword(Admin admin);

	public int changePass(String newPassword, long id);

	public int updatePass(String oldpassword, String newpassword);

}
