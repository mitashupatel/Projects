package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.admin.model.Contact;
import com.admin.model.User;
import com.admin.service.AdminsideContactService;

@Controller
@RequestMapping("/admin")
public class AdminsideContactController {
	
	@Autowired
	AdminsideContactService admincontactService;
	@RequestMapping(value="/contactList",method= {RequestMethod.GET})
	public String contactList(Model model) {
		
		List<Contact> contactList= admincontactService.getAll();
		model.addAttribute("contactList",contactList);
		return "ContactResponseList";
	}
}
