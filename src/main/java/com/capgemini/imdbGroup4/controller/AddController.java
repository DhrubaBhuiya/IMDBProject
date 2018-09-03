package com.capgemini.imdbGroup4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.imdbGroup4.pojo.ContentPojo;
import com.capgemini.imdbGroup4.service.AdminAddService;


@RestController
public class AddController {
	@Autowired
	private AdminAddService adminAddService;
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView addContent(Model model, @ModelAttribute("content") ContentPojo content){	
		ModelAndView mav = new ModelAndView();
		if((adminAddService.findByContentName(content.getContentName()) != null)){
			mav.addObject("error", "Content Name already exists");
			mav.setViewName("add");
			return mav;
		}
		ContentPojo content1= adminAddService.addContent(content);
		mav.addObject("content", content1);
		mav.setViewName("add");
		return mav;
	}

}
