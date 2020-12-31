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
import com.ivote.bean.Nations;
import com.ivote.service.AdminService;
import com.ivote.service.NationsService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin")
public class NationsController {

	@Autowired
	NationsService nationService;

	@Autowired
	HttpSession session;

	@RequestMapping("/nations")
	public String addNationPage(Model model) {
		Nations nations = new Nations();
		List<Nations> nationsList = nationService.getAll();
		model.addAttribute("nations", nations);
		model.addAttribute("nationsList", nationsList);
		model.addAttribute("edit", false);
		return "nations";
	}

	/*@RequestMapping("/adminList")
	public String adminList(Model model) {
		List<Admin> adminList = adminService.getAll();
		model.addAttribute("adminList", adminList);
		return "adminList";
	}*/

	@RequestMapping(value = { "/addNation" }, method = RequestMethod.POST)
	public String saveAdmin(@ModelAttribute("nations") Nations nations) {
		long result = nationService.saveUpdateNations(nations);
		return "redirect:/admin/nations";
	}

	@RequestMapping("/deleteNation/{nid}")
	public String deleteAdmin(@PathVariable long nid) {
		boolean result = nationService.deleteNations(nid);
		return "redirect:/admin/nations";
	}

	@RequestMapping("/editNation/{nid}")
	public String editAdmin(@PathVariable long nid, ModelMap model) {
		Nations nations = nationService.editNations(nid);
		List<Nations> nationsList = nationService.getAll();
		model.addAttribute("nations", nations);
		model.addAttribute("nationsList", nationsList);
		model.addAttribute("edit", true);
		return "nations";
	}
}
