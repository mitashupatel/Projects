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
import com.ivote.bean.Election;
import com.ivote.bean.MP;
import com.ivote.bean.Nations;
import com.ivote.bean.Party;
import com.ivote.bean.Regions;
import com.ivote.bean.Vote;
import com.ivote.bean.Voter;
import com.ivote.service.AdminService;
import com.ivote.service.ConstituenciesService;
import com.ivote.service.ElectionService;
import com.ivote.service.MPService;
import com.ivote.service.NationsService;
import com.ivote.service.PartyService;
import com.ivote.service.RegionsService;
import com.ivote.service.VoteService;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class VoteController {

	@Autowired
	VoteService voteService;
	@Autowired
	ConstituenciesService constituenciesService;
	@Autowired
	RegionsService regionsService;
	@Autowired
	NationsService nationsService;
	@Autowired
	PartyService partyService;
	@Autowired
	MPService mpService;
	@Autowired
	ElectionService electionService;


	@Autowired
	HttpSession session;

	@RequestMapping("/vote1")
	public String addVotePage(Model model) {
		Vote vote = new Vote();
		List<Constituencies> constituenciesList = constituenciesService.getAll();
		List<Regions> regionsList = regionsService.getAll();
		List<Nations> nationsList = nationsService.getAll();
		List<Election> electionList = electionService.getAll();
		List<Party> partyList = partyService.getAll();
		model.addAttribute("partyList", partyList);
		model.addAttribute("regionList", regionsList);
		model.addAttribute("nationList", nationsList);
		model.addAttribute("constituencyList", constituenciesList);
		model.addAttribute("vote", vote);
		model.addAttribute("edit", false);
		return "vote";
	}
	

	@RequestMapping("/userIndex")
	public String userIndex( Model model) {
		Voter newVoter = (Voter)session.getAttribute("user");
		List<Vote> mpList = voteService.getAllMPs((int)newVoter.getVoterId());
		model.addAttribute("mpList", mpList);
		
		return "votingpage";
	}
	@RequestMapping(value = "/voting/{mpId}/{voterId}/{electionId}/{partyId}", method = RequestMethod.GET)
	public @ResponseBody String getAllRegions(@PathVariable("mpId") int mpId,
			@PathVariable("voterId") int voterId,
			@PathVariable("electionId") int electionId, @PathVariable("partyId") int partyId) 
	{
		Vote v = new Vote();
		v.setElectionId(electionId);
		v.setMpId(mpId);
		v.setVoterId(voterId);
		v.setPartyId(partyId);
		voteService.saveUpdateVote(v);
	    return "success";
	}

	@RequestMapping("/voteResult/{electionId}")
	public String voteResult(@PathVariable int electionId, ModelMap model) {
		List<Vote> voteList = voteService.getVoteCounter(electionId);
		List<Election> electionList = electionService.getAll();
		model.addAttribute("electionList", electionList);
		model.addAttribute("voteList", voteList);
		
		return "voteResult";
	}
	
	@RequestMapping("/voteResult")
	public String voteResult1(Vote vote, ModelMap model) {
		List<Vote> voteList = voteService.getVoteCounter((int)vote.getElectionId());
		List<Election> electionList = electionService.getAll();
		model.addAttribute("electionList", electionList);
		model.addAttribute("voteList", voteList);
		
		return "voteResult";
	}
	
	
	
	
/*
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
		return "addAdmin";
	}*/
}
