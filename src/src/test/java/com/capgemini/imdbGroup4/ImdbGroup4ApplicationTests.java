package com.capgemini.imdbGroup4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.imdbGroup4.pojo.ContentPojo;
import com.capgemini.imdbGroup4.pojo.ReviewPojo;
import com.capgemini.imdbGroup4.service.*;
import com.capgemini.imdbGroup4.repository.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImdbGroup4ApplicationTests {

	@Test
	public void contextLoads() {
	}
	ContentPojo c=new ContentPojo();
	ReviewPojo p=new ReviewPojo();
	@Autowired
	private  AdminViewServiceContent adminViewServiceContent;
	@Autowired
	private  AdminViewServiceReview adminViewServiceReview;
	@MockBean
	private AdminViewRepositoryContent AdminViewRepositoryContent;
	@MockBean
	private AdminViewRepositoryReview AdminViewRepositoryReview;
	@Test
	public void getAllContent()
	{
		
	    c.getId();
		c.getContentname();
		c.getContent_type();
		c.getContent_actor();
		c.getContent_actress();
		c.getContent_producer();
		c.getContent_genre();
	
		c.getContentEndDate();
		c.getContentReleaseDate();
		//ContentPojo content1=new ContentPojo();
		 c.setContentname("raazi");
			c.setContent_type("bollywood");
			c.setContent_description("An Indian spy marries a Pakistani man during the Indo-Pakistan War of 1971.");
			c.setContent_genre("Thriller");
			c.setContent_actor("k");
			c.setContent_actress("Alia Bhat");
			c.setContent_director("m");
			c.setContent_producer("kj");
			c.setContentReleaseDate(new Date("11/05/2018"));
			c.setContentEndDate(new Date("05/06/2018"));	
			c.setData(null);
	     List<ContentPojo> content=new ArrayList<>();
	   Mockito.when(adminViewServiceContent.getAllContent()).thenReturn(content);
			assertThat(adminViewServiceContent.getAllContent()).isEqualTo(content);
	}
			@Test
			public void getAllReview()
			{
				p.getId();
				p.getContent_rating();
				p.getContent_review();
				p.getUser_id();
			   
			
				
				 p.setId(1);
					p.setContent_rating(3.5);
					p.setContent_review("Standard Movie ");
					p.setUser_id("sss");
			     List<ReviewPojo> review=new ArrayList<>();
			   Mockito.when(adminViewServiceReview.getAllReview()).thenReturn(review);
					assertThat(adminViewServiceReview.getAllReview()).isEqualTo(review);

	
		//Mockito.when(adminViewServiceContent.getAllContent().thenReturn(c);
		//assertEquals(addService.findByContentName("raazi").getContentName(),"raazi");

}
}