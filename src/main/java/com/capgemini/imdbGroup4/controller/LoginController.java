package com.capgemini.imdbGroup4.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class LoginController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
  
    public ModelAndView init() {
    	ModelAndView mav = new ModelAndView("index");
    	System.out.println("Yaay");
		return mav;
    }
}
