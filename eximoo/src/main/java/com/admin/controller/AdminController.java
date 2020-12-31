package com.admin.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.admin.model.Admin;

import com.admin.service.AdminService;


@Controller
@RequestMapping("/admin")
/*@SessionAttributes("admin")*/
public class AdminController {
	
	@Autowired
	AdminService adminService;
	@Autowired
	HttpSession session;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
	@RequestMapping(value="/addAdminpage",method= {RequestMethod.GET})
	public String addAdminpage(Model model) {
		
		
		Admin admin= new Admin();
		model.addAttribute("admin", admin);
		model.addAttribute("edit", false);
		return "AddAdmin";		
	}
	
	@RequestMapping(value="/adminList",method= {RequestMethod.GET})
	public String adminList(Model model) {
		
		List<Admin> adminList= adminService.getAll();
		model.addAttribute("adminList",adminList);
		return "AdminList";
	}
	
	@RequestMapping(value= { "/addAdmin" },method= {RequestMethod.POST})
	public String addAdmin(@ModelAttribute("admin") Admin admin, BindingResult result1 ,
		Model model, @RequestParam("photo") MultipartFile file){
		Admin admin1=(Admin)session.getAttribute("admin");
		admin.setCreatedBy(admin1.getAdminid());
		long result = adminService.saveUpdateAdmin(admin,file);
		return "redirect:/admin/adminList";
		
	}
	
	@RequestMapping(value = "/editAdmin/{adminid}", method = {RequestMethod.GET})
	public String editAdmin(@PathVariable long adminid,Model model)
	{
		Admin admin=adminService.editAdmin(adminid);
	    model.addAttribute("admin", admin);
	    return "AddAdmin";
	}
	
	@RequestMapping(value = "/deleteAdmin/{adminid}", method = {RequestMethod.GET})
	public String deleteAdmin(@PathVariable long adminid)
	{
		adminService.deleteAdmin(adminid);
	    return "redirect:/admin/adminList";
	}
	
	@RequestMapping(value="/lefthead",method= {RequestMethod.GET})
	public String lefthead(Model model) {
		
		return "lefthead";
		
	}
	
}
