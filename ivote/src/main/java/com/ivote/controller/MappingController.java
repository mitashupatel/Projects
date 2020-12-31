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
import com.ivote.bean.Constituencies;
import com.ivote.bean.Election;
import com.ivote.bean.MP;
import com.ivote.bean.Mapping;
import com.ivote.bean.Nations;
import com.ivote.bean.Party;
import com.ivote.bean.Regions;
import com.ivote.bean.Vote;
import com.ivote.service.AdminService;
import com.ivote.service.ConstituenciesService;
import com.ivote.service.ElectionService;
import com.ivote.service.MPService;
import com.ivote.service.MappingService;
import com.ivote.service.NationsService;
import com.ivote.service.PartyService;
import com.ivote.service.RegionsService;
import com.ivote.service.VoteService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin")
public class MappingController {

	@Autowired
	MappingService mappingService;
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

	@RequestMapping("/mapping")
	public String addVotePage(Model model) {
		Mapping mapping = new Mapping();
		List<Constituencies> constituenciesList = constituenciesService.getAll();
		List<Regions> regionsList = regionsService.getAll();
		List<Nations> nationsList = nationsService.getAll();
		List<Election> electionList = electionService.getAll();
		List<Party> partyList = partyService.getAll();
		List<MP> mpList = mpService.getAll();
		List<Mapping> mappingList = mappingService.getAll();
		model.addAttribute("mappingList", mappingList);
		model.addAttribute("mpList", mpList);
		model.addAttribute("partyList", partyList);
		model.addAttribute("regionList", regionsList);
		model.addAttribute("nationList", nationsList);
		model.addAttribute("constituencyList", constituenciesList);
		model.addAttribute("electionList", electionList);
		model.addAttribute("mapping", mapping);
		model.addAttribute("edit", false);
		return "mapping";
	}

	@RequestMapping("/mappingList")
	public String adminList(Model model) {
		List<Mapping> mappingList = mappingService.getAll();
		model.addAttribute("mappingList", mappingList);
		return "mapping";
	}

	@RequestMapping(value = { "/addMapping" }, method = RequestMethod.POST)
	public String saveAdmin(@ModelAttribute("mapping") Mapping mapping) {
		long result = mappingService.saveUpdateMapping(mapping);
		return "redirect:/admin/mapping";
	}

	@RequestMapping("/deleteMapping/{mid}")
	public String deleteMapping(@PathVariable long mid) {
		boolean result = mappingService.deleteMapping(mid);
		return "redirect:/admin/mapping";
	}

	@RequestMapping("/editMapping/{aid}")
	public String editMapping(@PathVariable long aid, ModelMap model) {
		Mapping mapping = mappingService.editMapping(aid);
		List<Constituencies> constituenciesList = constituenciesService.getAll();
		List<Regions> regionsList = regionsService.getAll();
		List<Nations> nationsList = nationsService.getAll();
		List<Election> electionList = electionService.getAll();
		List<Party> partyList = partyService.getAll();
		List<MP> mpList = mpService.getAll();
		List<Mapping> mappingList = mappingService.getAll();
		model.addAttribute("mappingList", mappingList);
		model.addAttribute("mpList", mpList);
		model.addAttribute("partyList", partyList);
		model.addAttribute("regionList", regionsList);
		model.addAttribute("nationList", nationsList);
		model.addAttribute("constituencyList", constituenciesList);
		model.addAttribute("electionList", electionList);
		model.addAttribute("mapping", mapping);
		model.addAttribute("edit", false);
		return "mapping";
	}
}
