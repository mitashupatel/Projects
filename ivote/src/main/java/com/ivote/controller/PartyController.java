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
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ivote.bean.Admin;
import com.ivote.bean.Leader;
import com.ivote.bean.Party;
import com.ivote.service.AdminService;
import com.ivote.service.LeaderService;
import com.ivote.service.PartyService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin")
public class PartyController {

	@Autowired
	PartyService partyService;
	
	@Autowired
	LeaderService leaderService;

	@Autowired
	HttpSession session;

	@RequestMapping("/addPartyPage")
	public String addPartyPage(Model model) {
		Party party = new Party();
		List<Leader> leaderList = leaderService.getAll();
		model.addAttribute("leaderList", leaderList);
		model.addAttribute("party", party);
		model.addAttribute("edit", false);
		return "addParty";
	}

	@RequestMapping("/partyList")
	public String partyList(Model model) {
		List<Party> partyList = partyService.getAllWithLeader();
		model.addAttribute("partyList", partyList);
		return "partyList";
	}

	@RequestMapping(value = { "/addParty" }, method = RequestMethod.POST)
	public String saveParty(@ModelAttribute("party") Party Party, BindingResult result, 
			Model model, @RequestParam("partyImage") MultipartFile file) {
		long result1 = partyService.saveUpdateParty(Party, file);
		return "redirect:/admin/partyList";
	}
	
	@RequestMapping("/deleteParty/{eid}")
	public String deleteParty(@PathVariable long eid) {
		boolean result = partyService.deleteParty(eid);
		return "redirect:/admin/PartyList";
	}

	@RequestMapping("/editParty/{eid}")
	public String editParty(@PathVariable long eid, ModelMap model) {
		Party Party = partyService.editParty(eid);
		List<Leader> leaderList = leaderService.getAll();
		model.addAttribute("leaderList", leaderList);
		model.addAttribute("party", Party);
		model.addAttribute("edit", true);
		return "addParty";
	}
}
