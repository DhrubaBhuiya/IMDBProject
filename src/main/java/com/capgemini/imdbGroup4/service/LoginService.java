package com.capgemini.imdbGroup4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.imdbGroup4.pojo.UserPojo;
import com.capgemini.imdbGroup4.repository.UserRepository;

@Service
public class LoginService {
	@Autowired
	
	private UserRepository registerRepository;	
			
			public UserPojo findByUserIdAndPassword(String userId, String password) {
				return registerRepository.findByUserIdAndPassword(userId,password);
			}

			
	public UserPojo findByEmailIdAndPassword(String emailId, String password) {
				return registerRepository.findByEmailIdAndPassword(emailId,password);
	}

}
