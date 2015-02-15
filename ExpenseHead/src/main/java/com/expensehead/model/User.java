package com.expensehead.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user", catalog = "expenseheaddb")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId")
	private int userId;

	@ManyToOne
	@JoinColumn(name = "groupName")
	private Group group;

	@Column(name = "userName")
	private String userName;

	@Column(name = "emailId")
	private String emailId;

	@Column(name = "contactNo")
	private String contactNo;

	@Column(name = "userType")
	private char userType;

	@Column(name = "password")
	private String password;

	@Column(name = "payable")
	private int payable;

	@Column(name = "receivable")
	private int receivable;

	public int getPayable() {
		return payable;
	}

	public void setPayable(int payable) {
		this.payable = payable;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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

	public char getUserType() {
		return userType;
	}

	public void setUserType(char userType) {
		this.userType = userType;
	}

	public int getReceivable() {
		return receivable;
	}

	public void setReceivable(int receivable) {
		this.receivable = receivable;
	}
	
	

}
