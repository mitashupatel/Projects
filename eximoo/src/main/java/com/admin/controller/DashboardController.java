package com.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/admin")
public class DashboardController {
	
	@RequestMapping(value="/dashboard",method= {RequestMethod.GET})
	public String dashBoard(Model model) {
		
		return "AdminSidedashboard";
		
	}
	
	
}

