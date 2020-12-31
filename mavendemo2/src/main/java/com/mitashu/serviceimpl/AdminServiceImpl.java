package com.mitashu.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitashu.dao.AdminDao;
import com.mitashu.model.Admin;
import com.mitashu.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;
	
	public Admin saveAdmin(Admin admin) {
		adminDao.saveAdmin(admin);
		return admin;
	}

	
	public Admin editAdmin(int id) {
		Admin admin=adminDao.editAdmin(id);
		return admin;
	}

	public int deleteAdmin(int id) {
         adminDao.deleteAdmin(id);
         return 0;

	}

	public List<Admin> getAll() {
		List<Admin> list= adminDao.getAll();
		return list;
	}

}
