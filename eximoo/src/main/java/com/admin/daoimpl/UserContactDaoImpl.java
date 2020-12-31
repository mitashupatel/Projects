package com.admin.daoimpl;

import org.springframework.stereotype.Repository;

import com.admin.dao.UserContactDao;
import com.admin.model.Contact;

@Repository("contactDao")
public class UserContactDaoImpl extends GenericDaoImpl<Contact> implements UserContactDao {

	public long saveUpdateContact(Contact contact) {
		return super.saveUpdateObject(contact).getContactId();
	}

}
