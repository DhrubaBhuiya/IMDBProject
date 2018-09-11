package com.capgemini.imdbGroup4.controller;


import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		public ModelAndView getView(HttpServletRequest req, HttpServletResponse res)	
		{
			HttpSession session = req.getSession();
			if(session.getAttribute("admin_name") == null){
				try {
					req.getRequestDispatcher("/admin").forward(req, res);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			ModelAndView mav= new ModelAndView("AdminView");
			return mav;
		}
		@RequestMapping(value="/AdminViewContent", method = RequestMethod.GET)
		public ModelAndView getAllcontent(HttpServletRequest req, HttpServletResponse res)throws Exception
		{
			HttpSession session = req.getSession();
			if(session.getAttribute("admin_name") == null){
				try {
					req.getRequestDispatcher("/admin").forward(req, res);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		ModelAndView mav= new ModelAndView();
		List<ContentPojo> contentList=adminViewServiceContent.getAllContent();
		  //ContentPojo c= adminViewServiceContent.getAll();
		  // String folder="";
		   for(ContentPojo c:contentList){
		   
		    /*if(c.getContentType().equals("hollywood"))folder="hmovies";
		    else if(c.getContentType().equals("bollywood"))folder="bmovies";
		    else if(c.getContentType().equals("tvShows"))folder="tvshows";*/
		    
			mav.addObject("contentList",contentList);
			//mav.addObject("folder",folder);
			File file = new File("./src/main/resources/static/content/"+c.getContentName()+".jpg");
			if(!file.exists()){
				ByteArrayInputStream bis=new ByteArrayInputStream(c.getData());
				BufferedImage bImage2=null;
				try {
					bImage2 = ImageIO.read(bis);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			     try {
					ImageIO.write(bImage2, "jpg", new File("./src/main/resources/static/content/"+c.getContentName()+".jpg")) ;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     System.out.println("image created");
			   }
		   }
		mav.setViewName("AdminViewContent");
		return mav;
		}
		
	
		
		     
			
		
		
			@RequestMapping(value ="/AdminViewReview", method = RequestMethod.GET)
			public ModelAndView getAllReview(HttpServletRequest req, HttpServletResponse res)
			{ 
				HttpSession session = req.getSession();
				if(session.getAttribute("admin_name") == null){
					try {
						req.getRequestDispatcher("/admin").forward(req, res);
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				ModelAndView mav= new ModelAndView();
				List<ReviewPojo> reviewList=adminViewServiceReview.getAllReview();
				mav.addObject("reviewList",reviewList);
				mav.setViewName("AdminViewReview");
				System.out.println(reviewList);
				return mav;
			}
				
			
	}