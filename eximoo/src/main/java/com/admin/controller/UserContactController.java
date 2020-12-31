package com.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.admin.model.Admin;
import com.admin.model.Contact;
import com.admin.service.UserContactService;


@Controller
@RequestMapping("/user")
/*@SessionAttributes("user")*/
public class UserContactController {
	
	@Autowired
	UserContactService contactService;
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/contactPage",method= {RequestMethod.GET})
	public String contact(Model model) {
		
		Contact contact= new Contact();
		model.addAttribute("contact", contact);
		
		
		return "contact";		
	}
	@RequestMapping(value= { "/contact" },method= {RequestMethod.POST})
	public String addContact(@ModelAttribute("contact") Contact contact,Model model){
		long result = contactService.saveUpdateContact(contact);
		return "redirect:/user/contactPage";
		
	}
}
