package com.admin.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.admin.model.Language;
import com.admin.model.NewsLetter;
import com.admin.model.Otp;
import com.admin.model.User;
import com.admin.service.LanguageService;
import com.admin.service.NewsLetterService;
import com.admin.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserSideController {
	
	@Autowired
	NewsLetterService newsletterService;
	@Autowired
	LanguageService languageService;
	
	@RequestMapping(value="/dashboard",method= {RequestMethod.GET})
	public String dashboard(Model model) {
		
		NewsLetter newsletter=new NewsLetter();
        model.addAttribute("newsletter", newsletter);
    	return "dashboard";
		
	}
	
	@RequestMapping(value = "/addEmail", method = {RequestMethod.POST})
	public String addEmail(@ModelAttribute("newsletter") NewsLetter newsletter, Model model)
	{
		
		newsletterService.saveNewsLetter(newsletter);

		
		return "redirect:/user/dashboard";
	   
	}
	@RequestMapping(value="/blog",method= {RequestMethod.GET})
	public String blog(Model model) {
		
		List<Language> languageList=languageService.getLanguage();
		model.addAttribute("languageList" ,languageList);
	    
		return "blog2";		
	}
	@RequestMapping(value="/community",method= {RequestMethod.GET})
	public String community() {
		
		
		return "community";		
	}
	@RequestMapping(value="/company",method= {RequestMethod.GET})
	public String company() {
		
		
		return "company";		
	}
	
	@RequestMapping(value="/quiz",method= {RequestMethod.GET})
	public String quiz() {
		
		
		return "quiz";		
	}
	@RequestMapping(value="/profile",method= {RequestMethod.GET})
	public String profile() {
		
		
		return "userprofile";		
	}

	@RequestMapping(value="/userOtp",method= {RequestMethod.GET})
	public String userOtp(Model model) {
		
		Otp otp = new  Otp();
		model.addAttribute("otp",otp);
		return "UserOtp";		
	}
	@RequestMapping(value="/userprofileUpdate",method= {RequestMethod.GET})
	public String userprofileUpdate() {
		
		
		return "UserProfileUpdate";		
	}

}
