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
import com.ivote.bean.Regions;
import com.ivote.service.AdminService;
import com.ivote.service.NationsService;
import com.ivote.service.RegionsService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin")
public class RegionsController {

	@Autowired
	RegionsService regionsService;
	
	@Autowired
	NationsService nationsService;

	@Autowired
	HttpSession session;

	@RequestMapping("/regions")
	public String addRegionsPage(Model model) {
		Regions regions = new Regions();
		List<Regions> regionsList = regionsService.getAll();
		List<Nations> nationsList = nationsService.getAll();
		model.addAttribute("regions", regions);
		model.addAttribute("regionsList", regionsList);
		model.addAttribute("nationList", nationsList);
		model.addAttribute("edit", false);
		return "regions";
	}

	/*@RequestMapping("/adminList")
	public String adminList(Model model) {
		List<Admin> adminList = adminService.getAll();
		model.addAttribute("adminList", adminList);
		return "adminList";
	}*/

	@RequestMapping(value = { "/addRegions" }, method = RequestMethod.POST)
	public String saveRegions(@ModelAttribute("regions") Regions regions) {
		long result = regionsService.saveUpdateRegions(regions);
		return "redirect:/admin/regions";
	}

	@RequestMapping("/deleteRegions/{rid}")
	public String deleteRegions(@PathVariable long rid) {
		boolean result = regionsService.deleteRegions(rid);
		return "redirect:/admin/regions";
	}

	@RequestMapping("/editRegions/{rid}")
	public String editRegions(@PathVariable long rid, ModelMap model) {
		Regions regions = regionsService.editRegions(rid);
		List<Regions> regionsList = regionsService.getAll();
		List<Nations> nationsList = nationsService.getAll();
		model.addAttribute("regions", regions);
		model.addAttribute("regionsList", regionsList);
		model.addAttribute("nationList", nationsList);
		model.addAttribute("edit", true);
		return "regions";
	}
}
