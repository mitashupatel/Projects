package com.admin.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.admin.model.QuizDetail;
import com.admin.model.Language;

import com.admin.service.QuizService;
import com.admin.service.LanguageService;

@Controller
@RequestMapping("/admin")
public class QuizController {

	@Autowired
	QuizService quizService;
	
	@Autowired
    LanguageService languageService;
	
	@RequestMapping(value="/createquiz",method= {RequestMethod.GET})
	public String createQuiz(Model model) {
		
		QuizDetail detail=new QuizDetail();
		model.addAttribute("detail", detail);
		model.addAttribute("edit", false);
		List<Language> languageList=languageService.getLanguage();
		model.addAttribute("languageList" ,languageList);
	    
		return "CreateQuiz";
		
	}
    
	@RequestMapping(value="/addQuizDetail",method= {RequestMethod.POST})
	public String addQuizDetail(@ModelAttribute("detail") QuizDetail detail,Model model) {
		
        int result = quizService.saveUpdateQuiz(detail);
       
        
         return "AddQuestionQuiz";

	}
	
	@RequestMapping(value="/showquiz",method= {RequestMethod.GET})
	public String showQuiz(Model model) {
		
		return "ShowQuiz";
		
	}
}
