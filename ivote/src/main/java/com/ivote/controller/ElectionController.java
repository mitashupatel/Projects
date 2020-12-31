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
import org.springframework.web.multipart.MultipartFile;
import com.ivote.bean.Election;
import com.ivote.service.ElectionService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("election")
public class ElectionController {

	@Autowired
	ElectionService electionService;

	@Autowired
	HttpSession session;

	@RequestMapping("/addElectionPage")
	public String addElectionPage(Model model) {
		Election Election = new Election();
		model.addAttribute("election", Election);
		model.addAttribute("edit", false);
		return "addElection";
	}

	@RequestMapping("/electionList")
	public String electionList(Model model) {
		List<Election> electionList = electionService.getAll();
		model.addAttribute("electionList", electionList);
		return "electionList";
	}

	@RequestMapping(value = { "/addElection" }, method = RequestMethod.POST)
	public String saveElection(@ModelAttribute("election") Election election, BindingResult result, 
			Model model, @RequestParam("electionImage") MultipartFile[] file) {
		long result1 = electionService.saveUpdateElection(election, file);
		return "redirect:/admin/electionList";
	}
	
	@RequestMapping("/deleteElection/{eid}")
	public String deleteElection(@PathVariable long eid) {
		boolean result = electionService.deleteElection(eid);
		return "redirect:/admin/electionList";
	}

	@RequestMapping("/editElection/{eid}")
	public String editElection(@PathVariable long eid, ModelMap model) {
		Election election = electionService.editElection(eid);
		model.addAttribute("election", election);
		model.addAttribute("edit", true);
		return "addElection";
	}
}