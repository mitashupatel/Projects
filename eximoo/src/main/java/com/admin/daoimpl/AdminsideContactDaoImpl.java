package com.admin.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.admin.dao.AdminsideContactDao;
import com.admin.model.Contact;
@Repository("admincontactDao")
public class AdminsideContactDaoImpl extends GenericDaoImpl<Contact> implements AdminsideContactDao{

		
	public List<Contact> getAll() {
		return (List<Contact>) super.getByQuery("FROM Contact a WHERE isDeleted=0");
	}
}
