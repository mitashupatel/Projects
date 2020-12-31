package com.mitashu.dao;

import java.util.List;

import com.mitashu.model.Admin;

public interface AdminDao {
	
	public Admin saveAdmin(Admin admin);
	public Admin editAdmin(int id);
	public int deleteAdmin(int id);
	public List<Admin> getAll();
	
	
}
