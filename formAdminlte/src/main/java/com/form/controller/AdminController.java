package com.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.form.model.Admin;
import com.form.service.AdminService;



@Controller
@RequestMapping("/admin")
public class AdminController {
		

	@RequestMapping(value="/homePage" , method= {RequestMethod.GET })
	public String homePage(Model model) {
		Admin admin=new Admin();
		model.addAttribute("admin", admin);
		model.addAttribute("edit", false);
		
		return "home";
		
	}
		
			
		
}
