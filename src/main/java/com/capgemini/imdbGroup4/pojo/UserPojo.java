package com.capgemini.imdbGroup4.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UserPojo {
	
	@Id
	private String userId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String password;
	@Column
	private String emailId;
	@Column
	private String phoneNo;
	
	public UserPojo() {
		super();
	}

	public UserPojo(String userId, String firstName, String lastName,
			String password, String emailId, String phoneNo) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "UserPojo [userId=" + userId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", password=" + password
				+ ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
	}

}
