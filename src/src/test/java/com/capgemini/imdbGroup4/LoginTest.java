package com.capgemini.imdbGroup4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.imdbGroup4.pojo.UserPojo;
import com.capgemini.imdbGroup4.repository.UserRepository;
import com.capgemini.imdbGroup4.service.LoginService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginTest {
	UserPojo user=new UserPojo();
	@Autowired
	private LoginService loginService;
	@MockBean
	private UserRepository userRepository;
	
	@Test
	public void loginUser(){
		user.setEmailId("prabhu.pragnya@gmail.com");
		user.setUserId("prag1996");
		user.setPassword("bmsit123");
		
		Mockito.when(userRepository.findByUserIdAndPassword("prag1996", "bmsit123")).thenReturn(new UserPojo("prag1996","pragnya","prabhu","bmsit123","prabhu.pragnya@gmail.com","9036851911"));
		assertEquals(loginService.findByUserIdAndPassword("prag1996", "bmsit123").getUserId(), "prag1996");
	
		Mockito.when(userRepository.findByEmailIdAndPassword("prabhu.pragnya@gmail.com", "bmsit123")).thenReturn(new UserPojo("prag96","pragnya","prabhu","bmsit123","prabhu.pragnya@gmail.com","9036851911"));
		assertEquals(loginService.findByEmailIdAndPassword("prabhu.pragnya@gmail.com", "bmsit123").getEmailId(), "prabhu.pragnya@gmail.com");
		
	}
}
