package com.capgemini.imdbGroup4.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class ReviewPojo {
	@Id
	private int id;
	private String content_review;
	private double content_rating;
	public String user_id;
	public ReviewPojo()
	{
		
	}
	public ReviewPojo(int id, String content_review,
			double content_rating, String user_id) {
		//super();
		this.id = id;
		this.content_review = content_review;
		this.content_rating = content_rating;
		this.user_id = user_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent_review() {
		return content_review;
	}
	public void setContent_review(String content_review) {
		this.content_review = content_review;
	}
	public double getContent_rating() {
		return content_rating;
	}
	public void setContent_rating(double content_rating) {
		this.content_rating = content_rating;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "ReviewPojo [id=" + id + ", content_review="
				+ content_review + ", content_rating=" + content_rating
				+ ", user_id=" + user_id + "]";
	}
	

}
