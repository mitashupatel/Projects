package cu.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import cu.portfolio.model.User;
import cu.portfolio.service.UserService;

@Controller
@RequestMapping("/user")

public class UserController {
		
		@Autowired
		UserService userService;

		@RequestMapping(value="/homePage" , method= {RequestMethod.GET })
		public String homePage(Model model) {
			User user =new User();
			model.addAttribute("user", user);
			model.addAttribute("edit", false);
			
			return "home";
			
		}
		@RequestMapping(value = "/addUser", method = { RequestMethod.POST})
		public String addUser(User user)
		{
		   userService.saveUser(user);
			
			return "home";
		}
		@RequestMapping(value = "/userList", method = { RequestMethod.GET})
		public String userList(Model model)
		{
			List<User> userList=userService.getAll();
			model.addAttribute("userList",userList);
			return "userList";
		}
		@RequestMapping(value = "/editUser/{id}", method = { RequestMethod.GET})
		public String editUser(@PathVariable int id, Model model)
		{
		   User user=userService.editUser(id);
			model.addAttribute("user",user);
			return "index";
		}
		@RequestMapping(value = "/deleteUser/{id}", method = { RequestMethod.GET})
		public String editUser(@PathVariable int id)
		{
		    userService.deleteUser(id);
			return "redirect:/user/userList";
		}
		
		@RequestMapping(value="/galleryPage" , method= {RequestMethod.GET })
		public String galleryPage() {
			
			return "gallery";
			
		}
		
}
