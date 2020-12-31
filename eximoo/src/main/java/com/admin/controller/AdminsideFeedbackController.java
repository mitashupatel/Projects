package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.admin.model.Contact;
import com.admin.model.Feedback;
import com.admin.service.AdminsideContactService;
import com.admin.service.AdminsideFeedbackService;

@Controller
@RequestMapping("/admin")
public class AdminsideFeedbackController {
		
	@Autowired
	AdminsideFeedbackService adminfeedbackService;
	@RequestMapping(value="/feedbackList",method= {RequestMethod.GET})
	public String feedbackList(Model model) {
		
		List<Feedback> feedbackList= adminfeedbackService.getAll();
		model.addAttribute("feedbackList",feedbackList);
		return "FeedbackResponseList";
	}
}
