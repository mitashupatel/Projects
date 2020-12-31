package com.admin.dao;

import java.util.List;

import com.admin.model.Admin;

public interface AdminDao extends GenericDAO<Admin>{
	
	public long saveUpdateAdmin(Admin admin);
	
	public Admin editAdmin(long adminid);
	
	public boolean deleteAdmin(long adminid);
	
	public List<Admin> getAll();

}
