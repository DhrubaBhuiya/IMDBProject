package com.capgemini.imdbGroup4.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.imdbGroup4.pojo.AdminPojo;

public interface AdminRepository extends CrudRepository<AdminPojo,String> {
	
	//public AdminPojo findByAdminId(String adminId);
	public AdminPojo findByAdminNameAndAdminPassword(String adminName, String adminPassword);

}

