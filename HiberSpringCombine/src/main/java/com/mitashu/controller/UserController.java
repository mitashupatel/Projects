package com.mitashu.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.mitashu.model.User;
import com.mitashu.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/homePage",method= {RequestMethod.GET})
	public String addPage(Model model) {
		
		List<User> datalist=userService.getAll();
		model.addAttribute("datalist",datalist);
		return "List";
		
	}
	@RequestMapping(value="/addUserPage",method= {RequestMethod.GET})
	public String addUserPage(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "AddUser";
		
	}
	@RequestMapping(value = "/addUser", method = {RequestMethod.POST})
	public String addUser(@ModelAttribute("user") User user, Model model)
	{
		userService.saveUser(user);
		return "redirect:/user/homePage";
	   
	}
	
	@RequestMapping(value = "/editUser/{id}", method = {RequestMethod.GET})
	public String editUser(@PathVariable int id,Model model)
	{
		User user=userService.edituser(id);
	    model.addAttribute("user", user);
	    return "AddUser";
	}
	
	@RequestMapping(value = "/deleteUser/{id}", method = {RequestMethod.GET})
	public String deleteUser(@PathVariable int id)
	{
		userService.deleteUser(id);
	    return "redirect:/user/homePage";
	}
	
}