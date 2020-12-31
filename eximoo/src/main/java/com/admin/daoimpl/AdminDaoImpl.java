package com.admin.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.admin.dao.AdminDao;
import com.admin.model.Admin;


@Repository("adminDao")
public class AdminDaoImpl extends GenericDaoImpl<Admin> implements AdminDao{

	public long saveUpdateAdmin(Admin admin) {
		return super.saveUpdateObject(admin).getAdminid();
	}

	public Admin editAdmin(long adminid) {
		return super.getById(Admin.class, adminid);
	}

	public boolean deleteAdmin(long adminid) {
		Admin admin = super.getById(Admin.class, adminid);
		admin.setIsDeleted(1);
		return super.updateObject(admin).getAdminid()> 0;
	}

	public List<Admin> getAll() {
		return (List<Admin>) super.getByQuery("FROM Admin a WHERE isDeleted=0");
	}

	

	
}
