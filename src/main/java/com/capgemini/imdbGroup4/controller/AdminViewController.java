package com.capgemini.imdbGroup4.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.imdbGroup4.pojo.ContentPojo;
import com.capgemini.imdbGroup4.pojo.ReviewPojo;
import com.capgemini.imdbGroup4.service.AdminViewServiceContent;
import com.capgemini.imdbGroup4.service.AdminViewServiceReview;


	@RestController
	public class AdminViewController {
		@Autowired
		private AdminViewServiceContent adminViewServiceContent;
		
		@Autowired
		private AdminViewServiceReview adminViewServiceReview;
		
		@RequestMapping(value="/AdminView", method = RequestMethod.GET)
		public ModelAndView getView()
		
		{ModelAndView mav= new ModelAndView("AdminView");
		return mav;
		}
		@RequestMapping(value="/AdminViewContent", method = RequestMethod.GET)
		public ModelAndView getAllcontent()
		
		{ModelAndView mav= new ModelAndView();
		List<ContentPojo> contentList=adminViewServiceContent.getAllContent();
		mav.addObject("contentList",contentList);
		mav.setViewName("AdminViewContent");
		return mav;
		}
		   
			@RequestMapping(value ="/AdminViewReview", method = RequestMethod.GET)
			public ModelAndView getAllReview()
			{ ModelAndView mav= new ModelAndView();
			List<ReviewPojo> reviewList=adminViewServiceReview.getAllReview();
			mav.addObject("reviewList",reviewList);
			mav.setViewName("AdminViewReview");
			System.out.println(reviewList);
			return mav;
			}
				
			
	}