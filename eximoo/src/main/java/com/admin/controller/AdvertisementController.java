package com.admin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.admin.model.Admin;
import com.admin.model.Advertisement;
import com.admin.service.AdminService;
import com.admin.service.AdvertisementService;

@Controller
@RequestMapping("/admin")
/*@SessionAttributes("admin")*/
public class AdvertisementController {
	
	@Autowired
	AdvertisementService advertisementService; 
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/addAdspage",method= {RequestMethod.GET})
	public String addAdspage(Model model) {
		
		Advertisement advertisement= new Advertisement();
		model.addAttribute("advertisement", advertisement);
		model.addAttribute("edit", false);
		return "AddAds";		
	}

	@RequestMapping(value="/advertisementList",method= {RequestMethod.GET})
	public String advertisementList(Model model) {
		
		List<Advertisement> advertisementList= advertisementService.getAll();
		model.addAttribute("advertisementList",advertisementList);
		return "showad";
	}
	
	@RequestMapping(value= { "/addAd" },method= {RequestMethod.POST})
	public String addAd(@ModelAttribute("advertisement") Advertisement advertisement, BindingResult result1 ,
		Model model, @RequestParam("adphoto") MultipartFile file){
		long result = advertisementService.saveUpdateAd(advertisement,file);
		return "redirect:/admin/advertisementList";
		
	}
	
	
	@RequestMapping(value = "/editAdvertisement/{advertisementId}", method = {RequestMethod.GET})
	public String editAdvertisement(@PathVariable long advertisementId,Model model)
	{
		Advertisement advertisement=advertisementService.editAdvertisement(advertisementId);
	    model.addAttribute("advertisement", advertisement);
	    return "AddAds";
	}
	
	@RequestMapping(value = "/deleteAdvertisement/{advertisementId}", method = {RequestMethod.GET})
	public String deleteAdvertisement(@PathVariable long advertisementId)
	{
		advertisementService.deleteAdvertisement(advertisementId);
	    return "redirect:/admin/advertisementList";
	}
	
	
	
	
	
}
