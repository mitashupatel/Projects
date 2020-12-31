package com.sheth.dao;

import java.util.List;

import com.sheth.model.Admin;

public interface AdminDao {
	
	public Admin saveAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public Admin editAdmin(int id);
	public int deleteAdmin(int id);
	public List<Admin> getAll();
	
	
}
