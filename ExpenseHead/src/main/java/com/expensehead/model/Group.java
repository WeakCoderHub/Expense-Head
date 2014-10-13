package com.expensehead.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "group_details")
public class Group {

	@Id
	@GeneratedValue
	@Column(name = "groupId")
	String groupId;

	@Column(name = "groupName")
	String groupName;

	@Column(name = "totalMembers")
	int noOfMembers;

	@Column(name = "address")
	String address;

	@Column(name = "helpLine1")
	String helpLine1;

	@Column(name = "helpLine2")
	String helpLine2;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "group")
	@Cascade(CascadeType.ALL)
	List<User> users;

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getNoOfMembers() {
		return noOfMembers;
	}

	public void setNoOfMembers(int noOfMembers) {
		this.noOfMembers = noOfMembers;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setHelpLine1(String helpLine1) {
		this.helpLine1 = helpLine1;
	}

	public String getHelpLine1() {
		return helpLine1;
	}
	
	public void setHelpLine2(String helpLine2) {
		this.helpLine2 = helpLine2;
	}

	public String getHelpLine2() {
		return helpLine2;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
