package com.capgemini.imdbGroup4.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.imdbGroup4.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	
	private LoginService loginService;

	 @RequestMapping(value = "/login", method = RequestMethod.POST)
	 public ModelAndView login(Model model,@ModelAttribute("id") String id, @ModelAttribute("password") String password, HttpServletRequest req) 
	 {
			 		
			 		if(loginService.findByUserIdAndPassword(id, password) != null) 
			       {
			 			ModelAndView mv = new ModelAndView(); 
			 			HttpSession session=req.getSession();
			 			session.setAttribute("id", id);
			 			mv.setViewName("home");
			 			return mv;
			 		}
	 
			 		if(loginService.findByEmailIdAndPassword(id, password) != null) 
				       {
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
