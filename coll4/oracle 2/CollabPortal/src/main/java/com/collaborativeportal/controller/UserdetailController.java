package com.collaborativeportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.collaborativeportal.model.UserBlog;
import com.collaborativeportal.service.UserdetailService;

@Controller
public class UserdetailController {
	
	@Autowired
	UserdetailService userdetailService;
	
	@RequestMapping("/signup")
	public ModelAndView gotoSupplier(@ModelAttribute("usd")UserBlog usd)
	{
		return new ModelAndView("signup");
	}
	
	@RequestMapping(value="addUser",method=RequestMethod.POST)
	public ModelAndView saveSupplier(@ModelAttribute("usd")UserBlog usd)
	{
		userdetailService.insertRow(usd);
		
		return new ModelAndView("signup").addObject("command", new UserBlog());
	}

}
