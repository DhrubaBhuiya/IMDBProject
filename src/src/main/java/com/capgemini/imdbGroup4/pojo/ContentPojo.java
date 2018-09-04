package com.capgemini.imdbGroup4.pojo;






import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mysql.jdbc.Blob;

@Entity
@Table(name="content")
public class ContentPojo {
	@Id
	private int content_id;
	private String content_name;
	private String content_type;
	private String content_description;
	private String content_genre;
	private String content_actor;
	private String content_actress;
	private String content_director;
	private String content_producer;
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date contentReleaseDate;
	@Column
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date contentEndDate;
	@Column(name="content_image")
	private byte[] data;

	public ContentPojo()
	{
		
	}
	public ContentPojo(int content_id, String content_name,
			String content_type, String content_description,
			String content_genre, String content_actor, String content_actress,
			String content_director, String content_producer,Date contentReleaseDate,
			Date contentEndDate, byte[] data) {
		super();
		this.content_id = content_id;
		this.content_name = content_name;
		this.content_type = content_type;
		this.content_description = content_description;
		this.content_genre = content_genre;
		this.content_actor = content_actor;
		this.content_actress = content_actress;
		this.content_director = content_director;
		this.content_producer = content_producer;
		this.contentReleaseDate = contentReleaseDate;
		this.contentEndDate = contentEndDate;
		this.data = data;
	}
	public int getContent_id() {
		return content_id;
	}
	public void setContent_id(int content_id) {
		this.content_id = content_id;
	}
	public String getContent_name() {
		return content_name;
	}
	public void setContent_name(String content_name) {
		this.content_name = content_name;
	}
	public String getContent_type() {
		return content_type;
	}
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
	public String getContent_description() {
		return content_description;
	}
	public void setContent_description(String content_description) {
		this.content_description = content_description;
	}
	public String getContent_genre() {
		return content_genre;
	}
	public void setContent_genre(String content_genre) {
		this.content_genre = content_genre;
	}
	public String getContent_actor() {
		return content_actor;
	}
	public void setContent_actor(String content_actor) {
		this.content_actor = content_actor;
	}
	public String getContent_actress() {
		return content_actress;
	}
	public void setContent_actress(String content_actress) {
		this.content_actress = content_actress;
	}
	public String getContent_director() {
		return content_director;
	}
	public void setContent_director(String content_director) {
		this.content_director = content_director;
	}
	public String getContent_producer() {
		return content_producer;
	}
	public void setContent_producer(String content_producer) {
		this.content_producer = content_producer;
	}
	public Date getContentReleaseDate() {
		return contentReleaseDate;
	}
	public void setContentReleaseDate(Date contentReleaseDate) {
		this.contentReleaseDate = contentReleaseDate;
	}
	public Date getContentEndDate() {
		return contentEndDate;
	}
	public void setContentEndDate(Date contentEndDate) {
		this.contentEndDate = contentEndDate;
	}
	public byte[] getData() {
        return data;
    }
 
    public void setData(byte[] data) {
        this.data = data;
    }
	@Override
	public String toString() {
		return "ContentPojo [content_id=" + content_id + ", content_name="
				+ content_name + ", content_type=" + content_type
				+ ", content_description=" + content_description
				+ ", content_genre=" + content_genre + ", content_actor="
				+ content_actor + ", content_actress=" + content_actress
				+ ", content_director=" + content_director
				+ ", content_producer=" + content_producer
				+ ", contentReleaseDate=" + contentReleaseDate
				+ ", contentEndDate=" + contentEndDate + ", data="
				+ Arrays.toString(data) + "]";
	}
	
	
	
	
}