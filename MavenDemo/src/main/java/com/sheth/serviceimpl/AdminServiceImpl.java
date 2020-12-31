package com.sheth.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheth.dao.AdminDao;
import com.sheth.model.Admin;
import com.sheth.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;
	
	public Admin saveAdmin(Admin admin) {
		adminDao.saveAdmin(admin);
		return null;
	}

	public Admin updateAdmin(Admin admin) {
		adminDao.updateAdmin(admin);
		return null;
	}

	public Admin editAdmin(int id) {
		return adminDao.editAdmin(id);
	}

	public int deleteAdmin(int id) {
		return adminDao.deleteAdmin(id);
	}

	public List<Admin> getAll() {
		return adminDao.getAll();
	}

}
