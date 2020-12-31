package com.admin.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.UserContactDao;
import com.admin.model.Contact;
import com.admin.service.UserContactService;

@Service("contactService")
@Transactional
public class UserContactServiceImpl implements UserContactService{
	
		
	@Autowired
	UserContactDao contactDao;
	
	public long saveUpdateContact(Contact contact) {
		contact.setIsActive(1);
		long contactId = 0;
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		contact.setAddingdate(formatter.format(date));
		contactDao.saveUpdateContact(contact);

		return contactId;
	}

}
