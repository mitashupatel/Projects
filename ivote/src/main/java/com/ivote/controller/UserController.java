package com.ivote.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ivote.bean.User;
import com.ivote.service.UserService;

@Controller
@RequestMapping("/admin")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	HttpSession session;

	@RequestMapping("/addUserPage")
	public String addUserPage(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		model.addAttribute("edit", false);
		return "addCustomer";
	}

	@RequestMapping("/userList")
	public String userList(Model model) {
		List<User> userList = userService.getAll();
		model.addAttribute("userList", userList);
		return "customerList";
	}

	@RequestMapping(value = { "/addUser" }, method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("User") User user) {
		long result = userService.saveUpdateUser(user);
		return "redirect:/admin/userList";
	}

	@RequestMapping("deleteUser/{uid}")
	public String deleteUser(@PathVariable long uid) {
		boolean result = userService.deleteUser(uid);
		return "redirect:/admin/userList";
	}

	@RequestMapping("/editUser/{uid}")
	public String editUser(@PathVariable long uid, ModelMap model) {
		User user = userService.editUser(uid);
		model.addAttribute("user", user);
		model.addAttribute("edit", true);
		return "addCustomer";
	}
}
