package com.ivote.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ivote.bean.Constituencies;
import com.ivote.bean.Nations;
import com.ivote.bean.PostCode;
import com.ivote.bean.Regions;
import com.ivote.service.AdminService;
import com.ivote.service.ConstituenciesService;
import com.ivote.service.NationsService;
import com.ivote.service.PostCodeService;
import com.ivote.service.RegionsService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin")
public class PostCodeController {

	@Autowired
	PostCodeService postCodeService;
	@Autowired
	RegionsService regionsService;
	@Autowired
	NationsService nationsService;
	@Autowired
	ConstituenciesService constituenciesService;

	@Autowired
	HttpSession session;

	@RequestMapping("/postCode")
	public String addPostCodePage(Model model) {
		PostCode postCode = new PostCode();
		List<PostCode> constituenciesList = postCodeService.getAll();
		List<Regions> regionsList = regionsService.getAll();
		List<Nations> nationsList = nationsService.getAll();
		List<PostCode> postCodeList = postCodeService.getAll();
		model.addAttribute("postcodeList", postCodeList);
		model.addAttribute("regionList", regionsList);
		model.addAttribute("nationList", nationsList);
		model.addAttribute("constituencyList", constituenciesList);
		model.addAttribute("postcode", postCode);
		model.addAttribute("edit", false);
		return "postCode";
	}
	
	@RequestMapping(value = "/getPostCode/{regionId}", method = RequestMethod.GET)
	public @ResponseBody List<Constituencies> getAllRegions(@PathVariable("regionId") int regionId) {
	    return constituenciesService.getAllConsByRegionId(regionId);
	}
/*
	@RequestMapping("/constituenciesList")
	public String constituenciesList(Model model) {
		List<PostCode> constituenciesList = constituenciesService.getAll();
		model.addAttribute("constituenciesList", constituenciesList);
		return "constituenciesList";
	}
*/
	@RequestMapping(value = { "/addPostCode" }, method = RequestMethod.POST)
	public String addPostCode(@ModelAttribute("postCode") PostCode postCode) {
		long result = postCodeService.saveUpdatePostCode(postCode);
		return "redirect:/admin/postCode";
	}

	@RequestMapping("/deletePostcode/{cid}")
	public String deletePostCode(@PathVariable long cid) {
		boolean result = postCodeService.deletePostCode(cid);
		return "redirect:/admin/postCode";
	}

	@RequestMapping("/editPostCode/{aid}")
	public String editPostCode(@PathVariable long aid, ModelMap model) {
		PostCode postCode = postCodeService.editPostCode(aid);
		List<PostCode> constituenciesList = postCodeService.getAll();
		List<Regions> regionsList = regionsService.getAll();
		List<Nations> nationsList = nationsService.getAll();
		List<PostCode> postCodeList = postCodeService.getAll();
		model.addAttribute("postcodeList", postCodeList);
		model.addAttribute("regionList", regionsList);
		model.addAttribute("nationList", nationsList);
		model.addAttribute("constituencyList", constituenciesList);
		model.addAttribute("postcode", postCode);
		model.addAttribute("edit", true);
		return "postCode";
	}
}
