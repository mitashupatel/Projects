package com.ivote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ivote.bean.Admin;
import com.ivote.service.LoginService;

@Controller
@RequestMapping("/admin")
@SessionAttributes("admin1")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	/*@RequestMapping(value= {"/"}, method=RequestMethod.GET)
	public String index() {
		return "redirect:/admin/login";
	}
*/
	@RequestMapping("/login")
	public String loginPage(Model model) {

		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		return "adminLogin";
	}

	@RequestMapping("/loggingIn")
	public String login(@ModelAttribute("admin") Admin admin, Model model) {

		Admin result = loginService.login(admin);
		if (result == null) {
			model.addAttribute("errorMsg", "Wrong Username or Password...!!!");
			return "redirect:/admin/login";
		}
		model.addAttribute("admin1", result);
		return "redirect:/admin/index";
	}

	@RequestMapping("/forgotPassword")
	public String forgot(Model model) {
		Admin forget = new Admin();
		model.addAttribute("password", forget);
		return "forgetPassword";
	}

	@RequestMapping("/forgettingpassword")
	public String forgetPassword(@ModelAttribute("password") Admin admin, Model model) {

		Admin result = loginService.forgotPassword(admin);
		if (result == null) {
			model.addAttribute("errorMsg", "Wrong Username or Password...!!!");
			return "redirect:/admin/login";
		}
		model.addAttribute("admin", result);
		return "redirect:/admin/login";
	}

	@RequestMapping("/changePassword")
	public String changePassword(Model model) {
		Admin admin = new Admin();
		model.addAttribute("cpassword", admin);
		return "changePassword";
	}

	@RequestMapping("/changingPassword")
	public String chPassword(@ModelAttribute("cpassword") Admin admin, Model model) {
		String msg = loginService.changePassword(admin.getPassword(), admin.getNpassword());
		model.addAttribute("msg", msg);
		return "redirect:/admin/changePassword";
	}

}
