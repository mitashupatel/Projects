package com.sheth.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sheth.model.Admin;
import com.sheth.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value = "/registrationPage", method = { RequestMethod.GET})
	public String registrationPage(Model model)
	{
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		model.addAttribute("edit", false);
		return "registration";
		
	}
	
	@RequestMapping(value = "/addAdmin", method = {RequestMethod.POST})
	public String addAdmin(@ModelAttribute("admin") Admin admin)
	{
		adminService.saveAdmin(admin);
		return "redirect:/admin/adminList";
	}
	
	@RequestMapping(value = "/deleteAdmin/{id}", method = {RequestMethod.GET})
	public String deleteAdmin(@PathVariable int id)
	{
		adminService.deleteAdmin(id);
		return "redirect:/admin/adminList";
	}
	
	@RequestMapping(value = "/editAdmin/{id}", method = {RequestMethod.GET})
	public String editAdmin(@PathVariable int id, Model model)
	{
		Admin admin = adminService.editAdmin(id);
		model.addAttribute("admin", admin);
		return "registration";
	}
	
	@RequestMapping(value = "/adminList", method = {RequestMethod.GET})
	public String adminList(Model model)
	{
		List<Admin> adminList = adminService.getAll();
		model.addAttribute("adminList", adminList);
		return "registrationList";
	}
	
	@RequestMapping(value = "/updateAdmin", method = {RequestMethod.POST})
	public String UpadteAdmin(@ModelAttribute("admin") Admin admin)
	{
		adminService.updateAdmin(admin);
		return "redirect:/admin/adminList";
	}

}
