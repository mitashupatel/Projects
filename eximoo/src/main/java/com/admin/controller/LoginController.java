package com.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.admin.model.Admin;
import com.admin.service.LoginService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	@Autowired
	HttpSession session;
	 
	@RequestMapping("/login")
	public String loginPage(Model model) {
		
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		return "login";
	}


	
	@RequestMapping("/loggingIn")
	public String login(@ModelAttribute("admin") Admin admin, Model model) {

		Admin result = loginService.login(admin);
		if (result == null) {
			model.addAttribute("errorMsg", "Wrong Username or Password...!!!");
			return "redirect:/admin/login";
		}
		model.addAttribute("admin", result);
		return "redirect:/admin/dashboard";
	}
	
	@RequestMapping("/profile")
	public String proFile(Model model) {
		Admin admin1=(Admin)session.getAttribute("admin");
		long adminId = admin1.getAdminid();
		return "Profile";
		
	}
	
	@RequestMapping(value="/forgotpassword",method= {RequestMethod.GET})
	public String forgotPassword(Model model) {
		
		return "forgotpassword";
		
	}
	@RequestMapping(value="/loginactivity",method= {RequestMethod.GET})
	public String loginActivity(Model model) {
		
		return "LoginActivity";
		
	}
	@RequestMapping(value="/adminLogout",method= {RequestMethod.GET})
	public String adminLogout(Model model) {
		
		return "adminlogout";
		
	}
	
}
