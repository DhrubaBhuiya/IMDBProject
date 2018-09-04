package com.capgemini.imdbGroup4;


import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.imdbGroup4.pojo.ContentPojo;
import com.capgemini.imdbGroup4.repository.ContentRepository;
import com.capgemini.imdbGroup4.service.AdminAddService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImdbGroup4ApplicationTests {

	@Test
	public void contextLoads() {
	}
	ContentPojo c=new ContentPojo();
	@Autowired
	private  AdminAddService addService;
	@MockBean
	private ContentRepository contentRepository;
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
}
