package com.admin.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.admin.dao.LoginDao;
import com.admin.model.Admin;

@Repository("loginDao")
public class LoginDaoImpl extends GenericDaoImpl<Admin> implements LoginDao {

	public Admin logincheck(Admin admin) {
		String query = "FROM Admin where email='" + admin.getEmail() + "' and password='" + admin.getPassword() + "'";
		List<Admin> list = super.getByQuery(query);
		if (list.size() == 0) {
			return null;
		}
		return list.get(0);
	}

}