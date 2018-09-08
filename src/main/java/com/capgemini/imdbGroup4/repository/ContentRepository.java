package com.capgemini.imdbGroup4.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.imdbGroup4.pojo.ContentPojo;


public interface ContentRepository extends CrudRepository<ContentPojo,Integer>{
		public ContentPojo findByContentName(String contentName);
		

}
