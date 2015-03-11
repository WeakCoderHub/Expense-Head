package com.expensehead.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//Pool Journal
@Entity
@Table(name = "journal", catalog = "expenseheaddb")
public class Journal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "recordId")
	private Integer recordId;

	@Column(name = "userId")
	private int userId;

	
	/**
	 * Return
	 */
	@Column(name = "credit")
	private int credit;

	/**
	 * Contribution
	 */
	@Column(name = "debit")
	private int debit;

	@Column(name = "recordDate")
	private Date recordDate;

	public Integer getRecordId() {
		return recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getDebit() {
		return debit;
	}

	public void setDebit(int debit) {
		this.debit = debit;
	}

	public Date getRecordDate() {
		return recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

}
