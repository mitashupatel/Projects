package com.admin.dao;

import java.util.List;

import com.admin.model.Contact;


public interface AdminsideContactDao extends GenericDAO<Contact> {
	
	public List<Contact> getAll();

}
