package com.admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.admin.model.Admin;
import com.admin.model.Otp;
import com.admin.model.User;
import com.admin.service.OtpService;
import com.admin.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserSignUpController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	OtpService otpService;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/register",method= {RequestMethod.GET})
	public String register(Model model) {
		
		User user= new User();
		model.addAttribute("user", user);
		model.addAttribute("edit", false);
		
		return "registration";		
	}
	
	
	
	@RequestMapping(value= { "/addUser" },method= {RequestMethod.POST})
	public String addUser(@ModelAttribute("user") User user, BindingResult result1 ,
		Model model, @RequestParam("userphoto") MultipartFile file){
		long result = userService.saveUpdateUser(user,file);
		return "userlogin";
		
	}
		
	@RequestMapping(value="/userlogin",method= {RequestMethod.GET})
	public String userlogin(Model model) {
		
		User user= new User();
		model.addAttribute("user", user);
		
		
		return "userlogin";				
	}
	

	@RequestMapping("/loggingIn")
	public String login(@ModelAttribute("user") User user, Model model) {

		long otpId = userService.login(user);
		if (otpId != 0) {
			Otp otp=new Otp();
			otp.setOtpId(otpId);
			model.addAttribute("otp", otp);
			return "UserOtp";
		}
		model.addAttribute("errorMsg", "Wrong Username or Password...!!!");
		return "redirect:/user/userlogin";
		
	}
	
	@RequestMapping("/varifyOtp")
	public String varifyOtp(@ModelAttribute("otp") Otp otp, Model model) {
		long result = otpService.varifyOtp(otp);
		if (result == 1) {
			return "redirect:/user/dashboard";
		}else {
			model.addAttribute("errorMsg","Wrong OTP");
		    return "UserOtp";
		    }
	}
	
	
	@RequestMapping("/forgotPassword")
	public String forgot(Model model) {
		User forget = new User();
		model.addAttribute("password", forget);
		return "UserForgotPassword";
	}

	@RequestMapping("/forgettingpassword")
	public String forgetPassword(@ModelAttribute("password") User user, Model model) {

		User result = userService.forgotPassword(user);
		if (result == null) {
			model.addAttribute("errorMsg", "Wrong Username or Password...!!!");
			return "redirect:/user/userlogin";
		}
		model.addAttribute("user", result);
		return "redirect:/user/userlogin";
	}

	@RequestMapping("/changePassword")
	public String changePassword(Model model) {
		User user= new User();
		model.addAttribute("cpassword", user);
		return "UserChangePassword";
	}

	@RequestMapping("/changingPassword")
	public String chPassword(@ModelAttribute("cpassword") User user, Model model) {
		String msg = userService.changePassword(user.getPassword(), user.getNpassword());
		model.addAttribute("msg", msg);
		return "redirect:/user/changePassword";
	}
	
	
}
