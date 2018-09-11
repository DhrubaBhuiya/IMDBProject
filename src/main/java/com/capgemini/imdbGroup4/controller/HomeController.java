package com.capgemini.imdbGroup4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView init() {
    	ModelAndView mav = new ModelAndView("home");
    	System.out.println("Controller reached");
		return mav;
    }
    
    @RequestMapping(value = "/Contact-us", method = RequestMethod.GET)
    public ModelAndView contact() {
    	ModelAndView mav = new ModelAndView("Contact-us");
		return mav;
    }
    @RequestMapping(value = "/About-us", method = RequestMethod.GET)
    public ModelAndView about() {
    	ModelAndView mav = new ModelAndView("About-us");
		return mav;
    }
    @RequestMapping(value = "/Help", method = RequestMethod.GET)
    public ModelAndView help() {
    	ModelAndView mav = new ModelAndView("Help");
		return mav;
    }
}
