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
import org.springframework.web.multipart.MultipartFile;
import com.ivote.bean.MP;
import com.ivote.service.MPService;

@Controller
@RequestMapping("/admin")
public class MPController {
	
	@Autowired
	MPService mpService;

	@Autowired
	HttpSession session;

	@RequestMapping("/addMPPage")
	public String addMPPage(Model model) {
		MP MP = new MP();
		model.addAttribute("mp", MP);
		model.addAttribute("edit", false);
		return "addMP";
	}

	@RequestMapping("/mpList")
	public String mpList(Model model) {
		List<MP> mpList = mpService.getAll();
		model.addAttribute("mpList", mpList);
		return "mpList";
	}

	@RequestMapping(value = { "/addMP" }, method = RequestMethod.POST)
	public String saveMP(@ModelAttribute("mp") MP mp, BindingResult result, 
			Model model, @RequestParam("mpImage") MultipartFile file) {
		long result1 = mpService.saveUpdateMP(mp, file);
		return "redirect:/admin/mpList";
	}
	
	@RequestMapping("/deleteMP/{eid}")
	public String deleteMP(@PathVariable long eid) {
		boolean result = mpService.deleteMP(eid);
		return "redirect:/admin/mpList";
	}

	@RequestMapping("/editMP/{mpId}")
	public String editMP(@PathVariable long mpId, ModelMap model) {
		MP mp = mpService.editMP(mpId);
		model.addAttribute("mp", mp);
		model.addAttribute("edit", true);
		return "addMP";
	}
}
