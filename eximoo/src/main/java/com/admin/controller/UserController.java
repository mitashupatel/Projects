package com.admin.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.admin.model.User;
import com.admin.service.UserService;



@Controller
@RequestMapping("/admin")
/*@SessionAttributes("admin")*/
public class UserController {
	
	@Autowired
	UserService userService;
	@Autowired
	HttpSession session;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
	@RequestMapping(value="/showadduser",method= {RequestMethod.GET})
	public String showadduser(Model model) {
		
		User user= new User();
		model.addAttribute("user", user);
		model.addAttribute("edit", false);
		return "AddUser";		
	}
	
	
	@RequestMapping(value= { "/addUser" },method= {RequestMethod.POST})
	public String addUser(@ModelAttribute("user") User user, BindingResult result1 ,
		Model model, @RequestParam("userphoto") MultipartFile file){
		long result = userService.saveUpdateUser(user,file);
		return "redirect:/admin/userList";
		
	}
	
	
	@RequestMapping(value="/userList",method= {RequestMethod.GET})
	public String userList(Model model) {
		
		List<User> userList= userService.getAll();
		model.addAttribute("userList",userList);
		return "UserList";
	}
	
	
	@RequestMapping("/checkEmail/{email}")
	public @ResponseBody String checkEmail(@PathVariable String email) {
		String strValue = "";
		boolean result = userService.isEmailExist(email+".com");
		if(result)
		{
			strValue = "Email id exist";
		}
		return strValue;
	}
	
	
	
	@RequestMapping(value = "/editUser/{userid}", method = {RequestMethod.GET})
	public String editUser(@PathVariable long userid,Model model)
	{
		User user=userService.editUser(userid);
	    model.addAttribute("user", user);
	    return "AddUser";
	}
	@RequestMapping(value = "/deleteUser/{userid}", method = {RequestMethod.GET})
	public String deleteUser(@PathVariable long userid)
	{
		userService.deleteUser(userid);
	    return "redirect:/admin/userList";
	}
}
