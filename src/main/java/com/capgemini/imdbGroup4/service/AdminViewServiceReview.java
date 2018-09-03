package com.capgemini.imdbGroup4.service;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.imdbGroup4.pojo.ReviewPojo;
import com.capgemini.imdbGroup4.repository.AdminViewRepositoryReview;

@Service
public class AdminViewServiceReview {
	@Autowired
	private AdminViewRepositoryReview adminViewRepositoryReview;

	 
		
		public  List<ReviewPojo> getAllReview()
		{
		
		List<ReviewPojo>reviews=new ArrayList<>();
		adminViewRepositoryReview.findAll().forEach(reviews::add);
		return reviews;
	}
}
