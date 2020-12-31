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

import com.ivote.bean.Voter;
import com.ivote.service.VoterService;
import com.ivote.service.VoterService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("voter")
public class VoterController {

	@Autowired
	VoterService voterService;

	@Autowired
	HttpSession session;

	@RequestMapping("/addVoterPage")
	public String addVoterPage(Model model) {
		Voter voter = new Voter();
		model.addAttribute("voter", voter);
		model.addAttribute("edit", false);
		return "addVoter";
	}
	
	@RequestMapping("/voterRegistrationPage")
	public String voterRegistrationPage(Model model) {
		Voter voter = new Voter();
		model.addAttribute("voter", voter);
		model.addAttribute("edit", false);
		return "voterregistration";
	}

	@RequestMapping("/voterList")
	public String voterList(Model model) {
		List<Voter> voterList = voterService.getAll();
		model.addAttribute("voterList", voterList);
		return "voterList";
	}

	@RequestMapping(value = { "/addVoter" }, method = RequestMethod.POST)
	public String saveVoter(@ModelAttribute("voter") Voter voter) {
		long result = voterService.saveUpdateVoter(voter);
		return "redirect:/admin/voterList";
	}
	
	@RequestMapping(value = { "/voterRegistration" }, method = RequestMethod.POST)
	public String voterRegistration(@ModelAttribute("voter") Voter voter) {
		long result = voterService.saveUpdateVoter(voter);
		return "redirect:/user/userLoginPage";
	}

	@RequestMapping("/deleteVoter/{aid}")
	public String deleteVoter(@PathVariable long aid) {
		boolean result = voterService.deleteVoter(aid);
		return "redirect:/admin/voterList";
	}

	@RequestMapping("/editVoter/{aid}")
	public String editVoter(@PathVariable long aid, ModelMap model) {
		Voter voter = voterService.editVoter(aid);
		model.addAttribute("voter", voter);
		model.addAttribute("edit", true);
		return "addVoter";
	}
}
