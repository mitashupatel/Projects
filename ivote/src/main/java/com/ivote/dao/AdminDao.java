package com.ivote.dao;

import java.util.List;

import com.ivote.bean.Admin;

public interface AdminDao extends GenericDAO<Admin> {

	public long saveUpdateAdmin(Admin admin);

	public Admin editAdmin(long id);

	public boolean deleteAdmin(long id);

	public List<Admin> getAll();

}
