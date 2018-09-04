package com.capgemini.imdbGroup4.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.imdbGroup4.pojo.UserPojo;

public interface UserRepository extends CrudRepository<UserPojo,String> {
	public UserPojo findByUserId(String userId);
	public UserPojo findByPhoneNo(String phoneNo);
	public UserPojo findByEmailId(String emailId);
	public UserPojo findByUserIdAndPassword(String userId,String password);
	public UserPojo findByEmailIdAndPassword(String emailId,String password);

}
