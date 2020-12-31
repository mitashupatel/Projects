package com.ivote.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ivote.bean.Admin;
import com.ivote.service.AdminService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin")
public class AdminController {

	@Autowired
	AdminService adminService;

	@Autowired
	HttpSession session;

	@RequestMapping("/addAdminPage")
	public String addAdminPage(Model model) {
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		model.addAttribute("edit", false);
		return "addAdmin";
	}

	@RequestMapping("/adminList")
	public String adminList(Model model) {
		List<Admin> adminList = adminService.getAll();
		model.addAttribute("adminList", adminList);
		return "adminList";
	}

	@RequestMapping(value = { "/addAdmin" }, method = RequestMethod.POST)
	public String saveAdmin(@ModelAttribute("admin") Admin admin) {
		long result = adminService.saveUpdateAdmin(admin);
		return "redirect:/admin/adminList";
	}

	@RequestMapping("/deleteAdmin/{aid}")
	public String deleteAdmin(@PathVariable long aid) {
		boolean result = adminService.deleteAdmin(aid);
		return "redirect:/admin/adminList";
	}

	@RequestMapping("/editAdmin/{aid}")
	public String editAdmin(@PathVariable long aid, ModelMap model) {
		Admin admin = adminService.editAdmin(aid);
		model.addAttribute("admin", admin);
		model.addAttribute("edit", true);
		model.addAttribute("msg", "wrong");
		return "addAdmin";
	}
}
