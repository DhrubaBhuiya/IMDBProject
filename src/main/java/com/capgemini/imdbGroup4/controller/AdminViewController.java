package com.capgemini.imdbGroup4.controller;


import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;
import java.util.*;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.imdbGroup4.pojo.ContentPojo;
import com.capgemini.imdbGroup4.pojo.ReviewPojo;
import com.capgemini.imdbGroup4.service.AdminAddService;
import com.capgemini.imdbGroup4.service.AdminViewServiceContent;
import com.capgemini.imdbGroup4.service.AdminViewServiceReview;


	@RestController
	public class AdminViewController {
		@Autowired
		private AdminViewServiceContent adminViewServiceContent;
		
		@Autowired
		private AdminViewServiceReview adminViewServiceReview;
		@Autowired
		private AdminAddService adminAddService;
		
	@RequestMapping(value="/AdminView", method = RequestMethod.GET)
		public ModelAndView getView()
		
		{ModelAndView mav= new ModelAndView("AdminView");
		return mav;
		}
		@RequestMapping(value="/AdminViewContent", method = RequestMethod.GET)
		public ModelAndView getAllcontent()throws Exception
		{
 //ContentPojo c=new ContentPojo();
		ModelAndView mav= new ModelAndView();
		List<ContentPojo> contentList=adminViewServiceContent.getAllContent();
		mav.addObject("contentList",contentList);
		mav.setViewName("AdminViewContent");
		return mav;
		}
		
		@RequestMapping(value = "/view/{content_id}", method = RequestMethod.GET)
	    public void viewImage(@PathVariable int id) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number ");
		int n=sc.nextInt();
		for(id=1;id<=n;id++)
		{
	     ContentPojo c=adminAddService.findById(id);
	     /*Blob arr=new Blob(c.getData());
	     for(byte b:arr)
	    	 System.out.println(b);*/
	     ByteArrayInputStream bis = new ByteArrayInputStream(c.getData());
	     BufferedImage bImage2=null;
		try {
			bImage2 = ImageIO.read(bis);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	     try {
			ImageIO.write(bImage2, "jpg", new File("\temp") );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     System.out.println("image created");
	    }
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