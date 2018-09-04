package com.capgemini.imdbGroup4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.imdbGroup4.pojo.UserPojo;
import com.capgemini.imdbGroup4.repository.UserRepository;

@Service
public class RegisterService {
@Autowired
private UserRepository registerRepository;	

public  UserPojo addUser(UserPojo userpojo) 
{
	System.out.println("service register");
		return registerRepository.save(userpojo);
	}

	public UserPojo findByPhoneNo(String phoneNo)
		
{
		return  registerRepository.findByPhoneNo(phoneNo);
		}
		
public UserPojo findByEmailId(String emailId) {
			return registerRepository.findByEmailId(emailId);
		}
		
		public UserPojo findByUserId(String userId) {
			return registerRepository.findByUserId(userId);
		}
		
		public UserPojo findByUserIdAndPassword(String userId, String password) {
			return registerRepository.findByUserIdAndPassword(userId,password);
		}
		public UserPojo findByEmailIdAndPassword(String emailId, String password) {
			return registerRepository.findByEmailIdAndPassword(emailId,password);
		}
		
		
}


