package com.expensehead.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class LoginModel {
	
	@Id
	@Column(name="userId")
	String id ;

}
