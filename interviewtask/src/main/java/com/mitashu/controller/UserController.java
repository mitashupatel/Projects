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
	
	@RequestMapping(value="/addUserPage",method= {RequestMethod.GET})
	public String addUserPage(Model model) {
		
		
		User user= new User();
		model.addAttribute("user", user);
		model.addAttribute("edit", false);
		return "Registration";		
	}
	@RequestMapping(value="/userList",method= {RequestMethod.GET})
	public String userList(Model model) {
		
		List<User> userList= userService.getAll();
		model.addAttribute("userList",userList);
		return "List";
	}
	
	@RequestMapping(value= { "/addUser" },method= {RequestMethod.POST})
	public String addUser(@ModelAttribute("user") User user){
		
		
		long result = userService.saveUpdateUser(user);
		return "redirect:/user/userList";
		
	}
	
	@RequestMapping(value = "/editUser/{userId}", method = {RequestMethod.GET})
	public String editUser(@PathVariable long userId,Model model)
	{
		User user=userService.editUser(userId);
	    model.addAttribute("user", user);
	    return "Registration";
	}
	
	@RequestMapping(value = "/deleteUser/{userId}", method = {RequestMethod.GET})
	public String deleteUser(@PathVariable long userId)
	{
		userService.deleteUser(userId);
	    return "redirect:/user/userList";
	}
	
}
