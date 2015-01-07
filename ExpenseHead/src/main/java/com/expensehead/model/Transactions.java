package com.expensehead.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactions", catalog = "expenseheaddb")
public class Transactions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transactionId")
	private Integer transactionId;

	@Column(name = "userId")
	private int userId;

	@Column(name = "groupId")
	private int groupId;

	@Column(name = "amount")
	private int amount;

	@Column(name = "expenseType")
	private String expenseType;

	@Column(name = "poolFlag")
	private boolean poolFlag;

	@Column(name = "discription")
	private String discription;

	@Column(name = "entryDate")
	private Date entryDate;

	@Column(name = "transactionDate")
	private Date transactionDate;

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Integer getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public void setPoolFlag(boolean poolFlag) {
		this.poolFlag = poolFlag;
	}

}
