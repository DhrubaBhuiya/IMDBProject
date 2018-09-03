package com.capgemini.imdbGroup4.pojo;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="content")
public class ContentPojo {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int contentId;
		@Column
		private String contentName;
		@Column
		private String contentType;
		@Column
		private String contentDescription;
		@Column
		private String contentGenre;
		@Column
		private String contentActor;
		@Column
		private String contentActress;
		@Column
		private String contentDirector;
		@Column
		private String contentProducer;
		@Column
	    @Temporal(TemporalType.DATE)
		@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
		private Date contentReleaseDate;
		@Column
		@Temporal(TemporalType.DATE)
		@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
		private Date contentEndDate;
		@Column
		private String contentImage;
		public ContentPojo(int contentId, String contentName,
				String contentType, String contentDescription,
				String contentGenre, String contentActor,
				String contentActress, String contentDirector,
				String contentProducer, Date contentReleaseDate,
				Date contentEndDate, String contentImage) {
			super();
			this.contentId = contentId;
			this.contentName = contentName;
			this.contentType = contentType;
			this.contentDescription = contentDescription;
			this.contentGenre = contentGenre;
			this.contentActor = contentActor;
			this.contentActress = contentActress;
			this.contentDirector = contentDirector;
			this.contentProducer = contentProducer;
			this.contentReleaseDate = contentReleaseDate;
			this.contentEndDate = contentEndDate;
			this.contentImage = contentImage;
		}
		
		public ContentPojo() {
			super();
		}
		public int getContentId() {
			return contentId;
		}
		public void setContentId(int contentId) {
			this.contentId = contentId;
		}
		public String getContentName() {
			return contentName;
		}
		public void setContentName(String contentName) {
			this.contentName = contentName;
		}
		public String getContentType() {
			return contentType;
		}
		public void setContentType(String contentType) {
			this.contentType = contentType;
		}
		public String getContentDescription() {
			return contentDescription;
		}
		public void setContentDescription(String contentDescription) {
			this.contentDescription = contentDescription;
		}
		public String getContentGenre() {
			return contentGenre;
		}
		public void setContentGenre(String contentGenre) {
			this.contentGenre = contentGenre;
		}
		public String getContentActor() {
			return contentActor;
		}
		public void setContentActor(String contentActor) {
			this.contentActor = contentActor;
		}
		public String getContentActress() {
			return contentActress;
		}
		public void setContentActress(String contentActress) {
			this.contentActress = contentActress;
		}
		public String getContentDirector() {
			return contentDirector;
		}
		public void setContentDirector(String contentDirector) {
			this.contentDirector = contentDirector;
		}
		public String getContentProducer() {
			return contentProducer;
		}
		public void setContentProducer(String contentProducer) {
			this.contentProducer = contentProducer;
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
		public String getContentImage() {
			return contentImage;
		}
		public void setContentImage(String contentImage) {
			this.contentImage = contentImage;
		}
		@Override
		public String toString() {
			return "ContentPojo [contentId=" + contentId + ", contentName="
					+ contentName + ", contentType=" + contentType
					+ ", contentDescription=" + contentDescription
					+ ", contentGenre=" + contentGenre + ", contentActor="
					+ contentActor + ", contentActress=" + contentActress
					+ ", contentDirector=" + contentDirector
					+ ", contentProducer=" + contentProducer
					+ ", contentReleaseDate=" + contentReleaseDate
					+ ", contentEndDate=" + contentEndDate + ", contentImage="
					+ contentImage + "]";
		}
		
		
		

}


