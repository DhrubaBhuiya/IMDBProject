package com.capgemini.imdbGroup4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.imdbGroup4.pojo.AdminPojo;
import com.capgemini.imdbGroup4.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public AdminPojo findByAdminNameAndAdminPassword(String adminId,String adminPassword)
	{
		
		return adminRepository.findByAdminNameAndAdminPassword(adminId,adminPassword);
	}


}

