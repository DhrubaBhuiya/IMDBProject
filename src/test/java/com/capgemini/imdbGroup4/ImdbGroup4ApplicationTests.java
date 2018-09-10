package com.capgemini.imdbGroup4;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.imdbGroup4.pojo.AdminPojo;
import com.capgemini.imdbGroup4.pojo.ContentPojo;
import com.capgemini.imdbGroup4.pojo.ReviewPojo;
import com.capgemini.imdbGroup4.repository.AdminRepository;
import com.capgemini.imdbGroup4.repository.AdminViewRepositoryContent;
import com.capgemini.imdbGroup4.repository.AdminViewRepositoryReview;
import com.capgemini.imdbGroup4.repository.ContentRepository;
import com.capgemini.imdbGroup4.service.AdminAddService;
import com.capgemini.imdbGroup4.service.AdminService;
import com.capgemini.imdbGroup4.service.AdminViewServiceContent;
import com.capgemini.imdbGroup4.service.AdminViewServiceReview;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImdbGroup4ApplicationTests {
	@Autowired
	private AdminService adminService;
	
	@MockBean
	private AdminRepository adminRepository;

	@Test
	public void contextLoads() {
		
		AdminPojo adminPojo=new AdminPojo();
		adminPojo.setAdminId("1");
		adminPojo.setAdminName("rakesh");
		adminPojo.setAdminPassword("123");
		
		Mockito.when(adminRepository.findByAdminNameAndAdminPassword("rakesh","123")).thenReturn(new AdminPojo("1","rakesh","123"));
		assertEquals(adminService.findByAdminNameAndAdminPassword("rakesh", "123").getAdminId(), "1");
		
	}
	ContentPojo c=new ContentPojo();
	@Autowired
	private  AdminAddService addService;
	@MockBean
	private ContentRepository contentRepository;
	@SuppressWarnings("deprecation")
	@Test
	public void addContent()
	{
		
	    c.setContentName("raazi");
		c.setContentType("bollywood");
		c.setContentDescription("An Indian spy marries a Pakistani man during the Indo-Pakistan War of 1971.");
		c.setContentGenre("Thriller");
		c.setContentActor("k");
		c.setContentActress("Alia Bhat");
		c.setContentDirector("m");
		c.setContentProducer("kj");
		c.setContentReleaseDate(new Date("11/05/2018"));
		c.setContentEndDate(new Date("05/06/2018"));	
		c.setData(null);
		Mockito.when(contentRepository.findByContentName("raazi")).thenReturn(c);
		assertEquals(addService.findByContentName("raazi").getContentName(),"raazi");

	}
	
	@Test
	public void test2() {
		
		AdminPojo adminPojo=new AdminPojo();
		adminPojo.setAdminId("4");
		adminPojo.setAdminName("rajesh");
		adminPojo.setAdminPassword("2345");
		
	Mockito.when(adminRepository.findByAdminNameAndAdminPassword("rajesh","2345")).thenReturn(new AdminPojo("4","rajesh","2345"));
	assertEquals(adminService.findByAdminNameAndAdminPassword("rajesh", "2345").getAdminId(), "4");
		
	}
	
	ContentPojo c1=new ContentPojo();
	ReviewPojo p=new ReviewPojo();
	@Autowired
	private  AdminViewServiceContent adminViewServiceContent;
	@Autowired
	private  AdminViewServiceReview adminViewServiceReview;
	@MockBean
	private AdminViewRepositoryContent adminViewRepositoryContent;
	@MockBean
	private AdminViewRepositoryReview adminViewRepositoryReview;
	@SuppressWarnings("deprecation")
	@Test
	public void getAllContent()
	{
		ContentPojo content1=new ContentPojo();
		 	c1.setContentName("raazi");
			c1.setContentType("bollywood");
			c1.setContentDescription("An Indian spy marries a Pakistani man during the Indo-Pakistan War of 1971.");
			c1.setContentGenre("Thriller");
			c1.setContentActor("k");
			c1.setContentActress("Alia Bhat");
			c1.setContentDirector("m");
			c1.setContentProducer("kj");
			c1.setContentReleaseDate(new Date("11/05/2018"));
			c1.setContentEndDate(new Date("05/06/2018"));	
			c1.setData(null);
			List<ContentPojo> content=new ArrayList<ContentPojo>();
	     content.add(content1);
	   Mockito.when(adminViewServiceContent.getAllContent()).thenReturn(content);
			assertThat(adminViewServiceContent.getAllContent()).isEqualTo(content);
	}

}
