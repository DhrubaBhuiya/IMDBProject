package com.capgemini.imdbGroup4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.imdbGroup4.pojo.ContentPojo;
import com.capgemini.imdbGroup4.repository.ContentRepository;

@Service
public class AdminAddService {
	@Autowired
	private ContentRepository contentRepository;

	 
	public  ContentPojo addContent(ContentPojo contentPojo) {
		return contentRepository.save(contentPojo);
	}


	public ContentPojo findByContentName(String contentName)
	{
	return  contentRepository.findByContentName(contentName);
	}
}
