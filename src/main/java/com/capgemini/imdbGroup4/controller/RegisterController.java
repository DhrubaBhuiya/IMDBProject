package com.capgemini.imdbGroup4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.imdbGroup4.pojo.UserPojo;
import com.capgemini.imdbGroup4.service.RegisterService;

@RestController
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView registerUser(Model model, @ModelAttribute("user") UserPojo user){	
		ModelAndView mav = new ModelAndView();
		if((registerService.findByEmailId(user.getEmailId()) != null)){
			mav.addObject("error", "Email Id already exists");
			mav.setViewName("signup");
			return mav;
		}
		if((registerService.findByUserId(user.getUserId()) != null)){
			mav.addObject("error", "User Id already exists");
			mav.setViewName("signup");
			return mav;
		}
		if((registerService.findByPhoneNo(user.getPhoneNo()) != null)){
			mav.addObject("error", "Phone number already exists");
			mav.setViewName("signup");
			return mav;
		}
		UserPojo user1= registerService.addUser(user);
		mav.addObject("user", user1);
		mav.setViewName("home");
		return mav;
	}
}
