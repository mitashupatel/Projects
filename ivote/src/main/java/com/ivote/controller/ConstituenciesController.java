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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ivote.bean.Admin;
import com.ivote.bean.Constituencies;
import com.ivote.bean.Nations;
import com.ivote.bean.Regions;
import com.ivote.service.AdminService;
import com.ivote.service.ConstituenciesService;
import com.ivote.service.NationsService;
import com.ivote.service.RegionsService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin")
public class ConstituenciesController {

	@Autowired
	ConstituenciesService constituenciesService;
	@Autowired
	RegionsService regionsService;
	@Autowired
	NationsService nationsService;

	@Autowired
	HttpSession session;

	@RequestMapping("/constituencies")
	public String addConstituenciesPage(Model model) {
		Constituencies constituencies = new Constituencies();
		List<Constituencies> constituenciesList = constituenciesService.getAll();
		List<Regions> regionsList = regionsService.getAll();
		List<Nations> nationsList = nationsService.getAll();
		model.addAttribute("regionList", regionsList);
		model.addAttribute("nationList", nationsList);
		model.addAttribute("constituencyList", constituenciesList);
		model.addAttribute("constituency", constituencies);
		model.addAttribute("edit", false);
		return "constituencies";
	}
	
	@RequestMapping(value = "/getRegions/{nationId}", method = RequestMethod.GET)
	public @ResponseBody List<Regions> getAllRegions(@PathVariable("nationId") int nationId) {
	    return regionsService.getAllRegionsByNationId(nationId);
	}
/*
	@RequestMapping("/constituenciesList")
	public String constituenciesList(Model model) {
		List<Constituencies> constituenciesList = constituenciesService.getAll();
		model.addAttribute("constituenciesList", constituenciesList);
		return "constituenciesList";
	}
*/
	@RequestMapping(value = { "/addConstituency" }, method = RequestMethod.POST)
	public String saveConstituencies(@ModelAttribute("constituencies") Constituencies constituencies) {
		long result = constituenciesService.saveUpdateConstituencies(constituencies);
		return "redirect:/admin/constituencies";
	}

	@RequestMapping("/deleteConstituency/{cid}")
	public String deleteConstituencies(@PathVariable long cid) {
		boolean result = constituenciesService.deleteConstituencies(cid);
		return "redirect:/admin/constituencies";
	}

	@RequestMapping("/editConstituency/{aid}")
	public String editConstituencies(@PathVariable long aid, ModelMap model) {
		Constituencies constituencies = constituenciesService.editConstituencies(aid);
		List<Constituencies> constituenciesList = constituenciesService.getAll();
		List<Regions> regionsList = regionsService.getAll();
		List<Nations> nationsList = nationsService.getAll();
		model.addAttribute("regionList", regionsList);
		model.addAttribute("nationList", nationsList);
		model.addAttribute("constituencyList", constituenciesList);
		model.addAttribute("constituency", constituencies);
		model.addAttribute("edit", true);
		return "constituencies";
	}
}
