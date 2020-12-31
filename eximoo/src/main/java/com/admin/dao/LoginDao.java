package com.admin.dao;

import com.admin.model.Admin;

public interface LoginDao extends GenericDAO<Admin> {

	public Admin logincheck(Admin admin);
}
