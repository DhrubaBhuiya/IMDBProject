package com.capgemini.imdbGroup4;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.imdbGroup4.pojo.UserPojo;
import com.capgemini.imdbGroup4.repository.UserRepository;
import com.capgemini.imdbGroup4.service.RegisterService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResgisterTest {
	UserPojo user=new UserPojo();
	@Autowired
	private  RegisterService registerService;
	@MockBean
	private UserRepository userRepository;
	
	@Test
	public void registerUser()
	{
		
		
		user.setFirstName("pragnya");
		user.setLastName("prabhu");
		user.setPassword("bmsit123");
		user.setPhoneNo("9036851911");
		user.setUserId("prag96");
		user.setEmailId("prabhu.pragnya@gmail.com");

		Mockito.when(userRepository.findByUserIdAndPassword("prag96", "bmsit123")).thenReturn(new UserPojo("prag96","pragnya","prabhu","bmsit123","prabhu.pragnya@gmail.com","9036851911"));
		assertEquals(registerService.findByUserIdAndPassword("prag96", "bmsit123").getUserId(), "prag96");
	
		Mockito.when(userRepository.findByEmailIdAndPassword("prabhu.pragnya@gmail.com", "bmsit123")).thenReturn(new UserPojo("prag96","pragnya","prabhu","bmsit123","prabhu.pragnya@gmail.com","9036851911"));
		assertEquals(registerService.findByEmailIdAndPassword("prabhu.pragnya@gmail.com", "bmsit123").getEmailId(), "prabhu.pragnya@gmail.com");
	
		Mockito.when(userRepository.findByUserId("prag96")).thenReturn(new UserPojo("prag96","pragnya","prabhu","bmsit123","prabhu.pragnya@gmail.com","9036851911"));
		assertEquals(registerService.findByUserId("prag96").getUserId(), "prag96");
	
		Mockito.when(userRepository.findByEmailId("prabhu.pragnya@gmail.com")).thenReturn(new UserPojo("prag96","pragnya","prabhu","bmsit123","prabhu.pragnya@gmail.com","9036851911"));
		assertEquals(registerService.findByEmailId("prabhu.pragnya@gmail.com").getEmailId(), "prabhu.pragnya@gmail.com");
	
		Mockito.when(userRepository.findByPhoneNo("9036851911")).thenReturn(new UserPojo("prag96","pragnya","prabhu","bmsit123","prabhu.pragnya@gmail.com","9036851911"));
		assertEquals(registerService.findByPhoneNo("9036851911").getPhoneNo(), "9036851911");
	
	
	}
	/*@Test
	public void regtest1(){
		user.setEmailId("prabhu.pragnya@gmail.com");

		Mockito.when(userRepository.findByEmailId("prabhu.pragnya@gmail.com")).thenReturn(new UserPojo("prag96","pragnya","prabhu","bmsit123","prabhu.pragnya@gmail.com","9036851911"));
		assertEquals(registerService.findByEmailId("prabhu.pragnya@gmail.com").getEmailId(), "prabhu.pragnya@gmail.com");
	
	}*/
	
	
}
