package com.expensehead.form;

import java.util.ArrayList;
import java.util.List;

public class RegisterForm {
	String groupName;
	String address;

	List<UserForm> listOfMembers = new ArrayList<UserForm>();

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<UserForm> getListOfMembers() {
		return listOfMembers;
	}

	public void setListOfMembers(List<UserForm> listOfMembers) {
		this.listOfMembers = listOfMembers;
	}

}
