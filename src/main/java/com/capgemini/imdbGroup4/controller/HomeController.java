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
}
