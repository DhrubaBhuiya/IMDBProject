package com.capgemini.imdbGroup4.repository;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.imdbGroup4.pojo.ReviewPojo;


public interface AdminViewRepositoryReview extends CrudRepository<ReviewPojo,Integer> {

}
