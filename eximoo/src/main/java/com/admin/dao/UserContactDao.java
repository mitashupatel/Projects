package com.admin.dao;

import com.admin.model.Contact;


public interface UserContactDao extends GenericDAO<Contact> {
		
	public long saveUpdateContact(Contact contact);
}
