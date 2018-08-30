package com.capgemini.imdbGroup4.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String init(Model model) {
    	System.out.println("Yaay");
		return "home";
	}
}
