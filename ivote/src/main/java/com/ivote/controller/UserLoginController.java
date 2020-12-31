package com.ivote.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.ivote.bean.Voter;
import com.ivote.service.MPService;
import com.ivote.service.UserLoginService;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserLoginController {
	
	@Autowired
	UserLoginService userLoginService;
	
	@Autowired
	MPService mpService;
	@Autowired
	HttpSession session;
	
	@RequestMapping(value= {"/"}, method=RequestMethod.GET)
	public String index() {
		return "redirect:/user/userLoginPage";
	}

	@RequestMapping("/userLoginPage")
	public String loginPage(Model model) {

		Voter voter = new Voter();
		model.addAttribute("voter", voter);
		return "voterlogin";
	}
	
	@RequestMapping("/otpPage")
	public String otpPage(Model model) {

		Voter voter = new Voter();
		model.addAttribute("voter", voter);
		return "sendotp";
	}
	
	@RequestMapping("/valOTP")
	public String otpCheck(Voter voter, Model model) {
		
		Voter newVoter = (Voter)session.getAttribute("user");
		boolean result = userLoginService.valOTP(voter.getOtp(), newVoter.getVoterId());
		if (!result) {
			model.addAttribute("errorMsg", "Please enter correct OTP");
			return "redirect:/user/otpPage";
		}
		model.addAttribute("user1", result);
		return "redirect:/user/userIndex";
	}

	@RequestMapping("/userLoggingIn")
	public String login(@ModelAttribute("voter") Voter voter, Model model) {

		Voter result = userLoginService.login(voter);
		if (result.getMsg() != null) {
			model.addAttribute("errorMsg", result.getMsg());
			return "redirect:/user/userLoginPage";
		}
		model.addAttribute("user", result);
		return "redirect:/user/otpPage";
	}
	
	@RequestMapping("/checkEmail/{email}")
	public @ResponseBody String checkEmail(@PathVariable String email) {
		String strValue = "";
		boolean result = userLoginService.isEmailExist(email+".com");
		if(result)
		{
			strValue = "Email id exist";
		}
		return strValue;
	}
	
	@RequestMapping("/checkNiNumber/{niNumber}")
	public @ResponseBody String checkNiNumber(@PathVariable String niNumber) {
		String strValue = "";
		boolean result = userLoginService.isNiExist(niNumber);
		if(result)
		{
			strValue = "NI number is exist";
		}
		return strValue;
	}
	
	@RequestMapping("/forgotPassword")
	public String forgot(Model model) {
		Voter forget = new Voter();
		model.addAttribute("password", forget);
		return "forgetPassword";
	}

	@RequestMapping("/forgettingpassword")
	public String forgetPassword(@ModelAttribute("password") Voter voter, Model model) {

		Voter result = userLoginService.forgotPassword(voter);
		if (result == null) {
			model.addAttribute("errorMsg", "Please enter currect Email Id...!!!");
			return "redirect:/user/userLoginPage";
		}
		model.addAttribute("admin", result);
		return "redirect:/user/userLoginPage";
	}

	/*	@RequestMapping("/changePassword")
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
*/
}
