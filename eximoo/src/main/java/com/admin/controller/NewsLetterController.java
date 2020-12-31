package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.admin.model.Admin;
import com.admin.model.Language;
import com.admin.model.Letter;
import com.admin.model.NewsLetter;
import com.admin.service.LetterService;
import com.admin.service.NewsLetterService;

@Controller
@RequestMapping("/admin")
public class NewsLetterController {
	
	@Autowired
	NewsLetterService newsletterService;
	
	
	@RequestMapping(value="/newsletterPage",method= {RequestMethod.GET})
	public String newsletterPage(Model model) {
		
		NewsLetter newsletter=new NewsLetter();
        model.addAttribute("newsletter", newsletter);
    	model.addAttribute("edit", false);
		List<NewsLetter> newsletterlist=newsletterService.getNewsLetter();
		model.addAttribute("newsletterlist" ,newsletterlist);
	    return "NewsLetter";
		
	}
	
	@RequestMapping(value = "/addEmail", method = {RequestMethod.POST})
	public String addEmail(@ModelAttribute("newsletter") NewsLetter newsletter, Model model)
	{
		
		newsletterService.saveNewsLetter(newsletter);

		
		return "redirect:/admin/newsletterPage";
	   
	}
	
	@RequestMapping(value = "/editNewsLetter/{newsletterId}", method = {RequestMethod.GET})
	public String editNewsLetter(@PathVariable long newsletterId,Model model)
	{
		NewsLetter newsletter=newsletterService.editNewsLetter(newsletterId);
	    model.addAttribute("newsletter", newsletter);
	    return "NewsLetter";
	}
	
	@RequestMapping(value = "/deleteNewsLetter/{newsletterId}", method = {RequestMethod.GET})
	public String deleteNewsLetter(@PathVariable long newsletterId)
	{
		newsletterService.deleteNewsLetter(newsletterId);
	    return "redirect:/admin/newsletterPage";
	}
	
	
	
	
	
	
	
	
}
