package com.admin.controller;
import java.util.List;

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


import com.admin.model.Blog;
import com.admin.model.Language;
import com.admin.service.BlogService;
import com.admin.service.LanguageService;


@Controller
@RequestMapping("/admin")
/*@SessionAttributes("admin")*/
public class BlogController {
	
	@Autowired
	BlogService blogService;
	
	@Autowired
	LanguageService languageService;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/addBlogPage",method= {RequestMethod.GET})
	public String addBlogPage(Model model) {
		
		Blog blog= new Blog();
		model.addAttribute("blog", blog);
		model.addAttribute("edit", false);
		List<Language> languageList=languageService.getLanguage();
		model.addAttribute("languageList" ,languageList);
	    
		return "CreateBlog";
		
	}
	
	@RequestMapping(value="/blogList",method= {RequestMethod.GET})
	public String blogList(Model model) {
		
		List<Blog> blogList= blogService.getAll();
		model.addAttribute("blogList",blogList);
		return "ShowBlogs";
	}
	
	@RequestMapping(value= { "/addBlog" },method= {RequestMethod.POST})
	public String addBlog(@ModelAttribute("blog") Blog blog, BindingResult result1 ,
		Model model, @RequestParam("photo1") MultipartFile file){
		long result = blogService.saveUpdateBlog(blog,file);
		return "redirect:/admin/blogList";
		
	}
	
	@RequestMapping(value = "/editBlog/{blogId}", method = {RequestMethod.GET})
	public String editBlog(@PathVariable long blogId,Model model)
	{
		Blog blog=blogService.editBlog(blogId);
	    model.addAttribute("blog", blog);
	    return "CreateBlog";
	}
	
	@RequestMapping(value = "/deleteBlog/{blogId}", method = {RequestMethod.GET})
	public String deleteBlog(@PathVariable long blogId)
	{
		blogService.deleteBlog(blogId);
	    return "redirect:/admin/blogList";
	}
	
	
	
	
	
	
}
