package com.ivote.service;

import java.util.List;

import com.ivote.bean.Admin;

public interface AdminService {

	public long saveUpdateAdmin(Admin ad);
	public Admin editAdmin(long id);
	public boolean deleteAdmin(long id);
	public List<Admin> getAll();
}
