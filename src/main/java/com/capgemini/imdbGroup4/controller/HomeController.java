package com.capgemini.imdbGroup4.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView init() {
    	ModelAndView mav = new ModelAndView("home");
    	//System.out.println("Controller reached");
		return mav;
    }
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView signup() {
    	ModelAndView mav = new ModelAndView("signup");
		return mav;
    }
    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public ModelAndView login() {
    	ModelAndView mav = new ModelAndView("login");
		return mav;
    }
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView admin(HttpServletRequest req, HttpServletResponse res) {
    	HttpSession session = req.getSession();
		if(session.getAttribute("admin_name") != null){
			ModelAndView mav = new ModelAndView("admin-home");
			return mav;
		}
    	ModelAndView mav = new ModelAndView("admin-login");
		return mav;
    }
}
