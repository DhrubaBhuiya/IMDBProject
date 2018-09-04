package com.capgemini.imdbGroup4.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.imdbGroup4.pojo.ContentPojo;

public interface AdminViewRepositoryContent extends CrudRepository<ContentPojo,Integer> {

}
