
package com.capgemini.imdbGroup4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.imdbGroup4.pojo.ContentPojo;
import com.capgemini.imdbGroup4.repository.AdminViewRepositoryContent;


@Service
public class AdminAddService {
	@Autowired
	private AdminViewRepositoryContent adminViewRepositoryContent;

	 
	public  ContentPojo addContent(ContentPojo contentPojo) {
		return adminViewRepositoryContent.save(contentPojo);
	}


	/*public ContentPojo findByContentName(String contentname)
	{
	return  adminViewRepositoryContent.findByContentName(contentname);
	}
}*/
	public ContentPojo findById(int id)
	{
		return adminViewRepositoryContent.findById(id);
	}
}
	//public ContentPojo findAllDetails(ContentPojo c)
	//{
		//return adminViewRepositoryContent.findAllDetails(c);
	//}
//}
