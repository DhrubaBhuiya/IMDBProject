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

import com.capgemini.imdbGroup4.pojo.ContentPojo;
import com.capgemini.imdbGroup4.pojo.ReviewPojo;
import com.capgemini.imdbGroup4.service.AdminViewServiceContent;
import com.capgemini.imdbGroup4.service.AdminViewServiceReview;

	@Controller
	@RestController
	public class AdminViewController {
		@Autowired
		private AdminViewServiceContent adminViewServiceContent;
		@Autowired
		private AdminViewServiceReview adminViewServiceReview;
		@RequestMapping("/Content")
		public List<ContentPojo> getAllContent()
		
		{ return (adminViewServiceContent).getAllContent();
		}
	
			@RequestMapping("/Review")
			public List<ReviewPojo> getAllReview()
			
			{ return (adminViewServiceReview).getAllReview();
			}
	}