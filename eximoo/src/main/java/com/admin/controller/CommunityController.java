package com.admin.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class CommunityController {
	@RequestMapping(value="/communitylist",method= {RequestMethod.GET})
	public String communityList(Model model) {
		
		return "CommunityList";
		
	}
}
