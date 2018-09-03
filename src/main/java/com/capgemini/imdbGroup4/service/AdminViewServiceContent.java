package com.capgemini.imdbGroup4.service;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.imdbGroup4.pojo.ContentPojo;
import com.capgemini.imdbGroup4.repository.AdminViewRepositoryContent;

@Service
public class AdminViewServiceContent {
	@Autowired
	private AdminViewRepositoryContent adminViewRepositoryContent;

	 
		
		public  List<ContentPojo> getAllContent()
		{
		
		List<ContentPojo>contents=new ArrayList<>();
		adminViewRepositoryContent.findAll().forEach(contents::add);
		return contents;
	}
}
