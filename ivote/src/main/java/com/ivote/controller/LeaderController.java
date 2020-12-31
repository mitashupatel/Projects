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
import com.ivote.bean.Leader;
import com.ivote.service.LeaderService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin")
public class LeaderController {

	@Autowired
	LeaderService leaderService;

	@Autowired
	HttpSession session;

	@RequestMapping("/addLeaderPage")
	public String addLeaderPage(Model model) {
		Leader Leader = new Leader();
		model.addAttribute("leader", Leader);
		model.addAttribute("edit", false);
		return "addLeader";
	}

	@RequestMapping("/leaderList")
	public String leaderList(Model model) {
		List<Leader> leaderList = leaderService.getAll();
		model.addAttribute("leaderList", leaderList);
		return "leaderList";
	}

	@RequestMapping(value = { "/addLeader" }, method = RequestMethod.POST)
	public String saveLeader(@ModelAttribute("leader") Leader leader, BindingResult result, 
			Model model, @RequestParam("leaderImage") MultipartFile file) {
		long result1 = leaderService.saveUpdateLeader(leader, file);
		return "redirect:/admin/leaderList";
	}
	
	@RequestMapping("/deleteLeader/{eid}")
	public String deleteLeader(@PathVariable long eid) {
		boolean result = leaderService.deleteLeader(eid);
		return "redirect:/admin/leaderList";
	}

	@RequestMapping("/editLeader/{eid}")
	public String editLeader(@PathVariable long eid, ModelMap model) {
		Leader leader = leaderService.editLeader(eid);
		model.addAttribute("leader", leader);
		model.addAttribute("edit", true);
		return "addLeader";
	}
}
