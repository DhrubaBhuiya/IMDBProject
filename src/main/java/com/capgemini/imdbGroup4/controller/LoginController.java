package com.capgemini.imdbGroup4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
	@Autowired
	private LoginService login;
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(Model model,@ModelAttribute("id") String id, @ModelAttribute("password") String password )
	{
		
		if(LoginService.findByNameAndPassword(id, password) != null) {
			ModelAndView mv = new ModelAndView(); 
			mv.setViewName("home");
			return mv;
		}
		else {
			ModelAndView mv = new ModelAndView();
			mv.addObject("error", "Invalid Details");
			mv.setViewName("login");
			return mv;
		}
    }

}
