package com.capgemini.imdbGroup4.controller;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.rowset.serial.SerialException;

import org.apache.commons.io.IOUtils;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.imdbGroup4.pojo.ContentPojo;
import com.capgemini.imdbGroup4.service.AdminAddService;


@RestController
public class AddController {
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView init() {
    	ModelAndView mav = new ModelAndView("add");
    	mav.addObject("msg",null);
		return mav;
    }
	
	@Autowired
	private AdminAddService adminAddService;
	@RequestMapping(value="/addcontent",method=RequestMethod.POST)
	public ModelAndView addContent(Model model, @ModelAttribute("content") ContentPojo content,@RequestParam("contentImage") MultipartFile file){	
		ModelAndView mav = new ModelAndView();
		Date date=null;
		if(content.getContentEndDate()!=null)
			date=content.getContentEndDate();
		else
		{
			//DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			date=new Date();
		}
		if((adminAddService.findByContentName(content.getContentName()) != null)){
			mav.addObject("error", "Content Name already exists");
			mav.setViewName("add");
			return mav;
		}
		
		else if(content.getContentReleaseDate().compareTo(date) > 0)
		{
			mav.addObject("error", "Release date should be before End date");
			mav.setViewName("add");
			return mav;
			
		}
		if (file != null) {
                System.out.println("Saving file: " + file.getOriginalFilename());
                 
                try {
					content.setData(file.getBytes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                adminAddService.addContent(content);               
        }
		//content.setData(file);
		//ContentPojo content1= adminAddService.addContent(content);
		//mav.addObject("content", content1);
		mav.setViewName("add");
		mav.addObject("msg","successfully added");
		return mav;
	}

}
