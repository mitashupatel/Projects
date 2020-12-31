package com.ivote.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ivote.bean.Admin;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin")
public class DashboardController {

	@Autowired
	HttpSession session;
	
	@RequestMapping("/index")
	public String index(Admin ad, Model model) {
		Admin admin = (Admin) session.getAttribute("admin");
		//System.out.println("Admin Name : " + admin.getFname());
		model.addAttribute("admin", admin);
		return "adminDashboard";
	}

}
