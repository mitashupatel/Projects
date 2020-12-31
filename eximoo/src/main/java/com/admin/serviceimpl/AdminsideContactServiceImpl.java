package com.admin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.admin.dao.AdminsideContactDao;
import com.admin.model.Contact;
import com.admin.service.AdminsideContactService;


@Service("admincontactService")
@Transactional
@SessionAttributes("admin")
public class AdminsideContactServiceImpl implements AdminsideContactService{
		
		@Autowired
		AdminsideContactDao admincontactDao;
			
		public List<Contact> getAll() {
			List<Contact> contactList = admincontactDao.getAll();
			
			return contactList;
		}
}
