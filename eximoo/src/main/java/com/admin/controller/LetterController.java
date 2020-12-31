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

import com.admin.model.Admin;
import com.admin.model.Letter;
import com.admin.model.NewsLetter;
import com.admin.service.LetterService;
import com.admin.service.NewsLetterService;
import com.admin.utills.Mailer;

@Controller
@RequestMapping("/admin")
/*@SessionAttributes("admin")*/
public class LetterController {
		

	@Autowired
	LetterService letterService;
	@Autowired
	HttpSession session;

	@RequestMapping(value = "/newslettersend", method = { RequestMethod.GET })
	public String newsLettersend(Model model) {
		Letter letter = new Letter();
		model.addAttribute("letter", letter);
		return "NewsLetterSend";
	}

	@RequestMapping(value = { "/sendLetter" }, method = RequestMethod.POST)
	public String saveLetter(@ModelAttribute("letter") Letter letter) {
		
		
		
		long result = letterService.saveUpdateLetter(letter);
		return "redirect:/admin/newslettersend";
	}

}
