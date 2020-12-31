package com.admin.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.admin.model.Language;
import com.admin.service.LanguageService;
import com.admin.service.UserService;

@Controller
@RequestMapping("/admin")
public class LanguageController {
	
	@Autowired
	LanguageService languageService;
	
	/*@RequestMapping(value="/languagemaster",method= {RequestMethod.GET})
	public String languageMaster(Model model) {
		
		Language language=new Language();
		model.addAttribute("language",language);
		return "languagemaster";
	}*/
	
	@RequestMapping(value="/timeperquestionmaster",method= {RequestMethod.GET})
	public String timeperQuestionmaster(Model model) {
		
		return "timeperquestionmaster";
		
	}
	
	@RequestMapping(value="/showLanguage",method= {RequestMethod.GET})
	public String showLanguage(Model model) {
		
		Language language=new Language();
        model.addAttribute("language", language);
    	model.addAttribute("edit", false);
		List<Language> languageList=languageService.getLanguage();
		model.addAttribute("languageList" ,languageList);
	    return "languagemaster";
		
	}
	@RequestMapping(value = "/addLanguage", method = {RequestMethod.POST})
	public String addLanguage(@ModelAttribute("language") Language language, Model model)
	{
		
		languageService.saveLanguage(language);

		
		return "redirect:/admin/showLanguage";
	   
	}
	
	@RequestMapping(value = "/editLanguage/{languageId}", method = {RequestMethod.GET})
	public String editLanguage(@PathVariable long languageId,Model model)
	{
		Language language=languageService.editLanguage(languageId);
	    model.addAttribute("language", language);
	    return "languagemaster";
	}
	
	@RequestMapping(value = "/deleteLanguage/{languageId}", method = {RequestMethod.GET})
	public String deleteLanguage(@PathVariable long languageId)
	{
		languageService.deleteLanguage(languageId);
	    return "redirect:/admin/showLanguage";
	}
	
	
	
}
