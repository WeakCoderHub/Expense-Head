package com.expensehead.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;



@Entity
@Table(name="user_details")
public class User {
	@Id
	@GeneratedValue
	@Column(name="user_id")
	String userId;
	
	@ManyToOne
	@Cascade(CascadeType.ALL)
	@JoinColumn(name="groupId")
	Group group;
	
	@Column(name="user_name")
	String userName;
	
	@Column(name="email_id")
	String emailId;
	
	@Column(name="contactNo")
	String contactNo;
	
	@Column(name="userType")
	char userType;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContact(String contactNo) {
		this.contactNo = contactNo;
	}
	public char getUserType() {
		return userType;
	}
	public void setUserType(char userType) {
		this.userType = userType;
	}
	
	
}
