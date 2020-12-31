package com.admin.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class CustomQuizController {
	@RequestMapping(value="/createcustomquiz",method= {RequestMethod.GET})
	public String createCustomquiz(Model model) {
		
		return "CreateCustomQuiz";
		
	}
	@RequestMapping(value="/addquestioncustomquiz",method= {RequestMethod.GET})
	public String addQuestioncustomquiz(Model model) {
		
		return "AddQuestionCustomQuiz";
		
	}
	@RequestMapping(value="/showcustomquiz",method= {RequestMethod.GET})
	public String showCustomquiz(Model model) {
		
		return "ShowCustomQuiz";
		
	}

}
