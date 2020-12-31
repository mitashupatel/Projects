package com.admin.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.admin.model.Admin;


public interface AdminService {

	public long saveUpdateAdmin(Admin admin, MultipartFile file);
	public Admin editAdmin(long adminid);
	public boolean deleteAdmin(long adminid);
	public List<Admin> getAll();
} 
		
	

