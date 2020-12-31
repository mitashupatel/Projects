package com.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.admin.model.Contact;
import com.admin.model.Feedback;
import com.admin.service.UserFeedbackService;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserFeedbackController {
			
	@Autowired
	UserFeedbackService feedbackService;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/feedbackPage",method= {RequestMethod.GET})
	public String feedback(Model model) {
		
		Feedback feedback= new Feedback();
		model.addAttribute("feedback", feedback);
		
		
		return "feedback";		
	}
	@RequestMapping(value= { "/feedback" },method= {RequestMethod.POST})
	public String addFeedback(@ModelAttribute("feedback") Feedback feedback,Model model){
		long result = feedbackService.saveUpdateFeedback(feedback);
		return "redirect:/user/feedbackPage";
		
	}
}
