package com.expensehead.form;

import java.util.List;

public class GroupTransactionSummary {

	int totalDeposits;
	int balance;
	int expenses;
	List<MemberSummary> memberSummary;

	public int getTotalDeposits() {
		return totalDeposits;
	}

	public void setTotalDeposits(int totalDeposits) {
		this.totalDeposits = totalDeposits;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getExpenses() {
		return expenses;
	}

	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}

	public List<MemberSummary> getMemberSummary() {
		return memberSummary;
	}

	public void setMemberSummary(List<MemberSummary> memberSummary) {
		this.memberSummary = memberSummary;
	}

	public class MemberSummary {
		String memberName;
		int payable;
		int payback;

		public String getMemberName() {
			return memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public int getPayable() {
			return payable;
		}

		public void setPayable(int payable) {
			this.payable = payable;
		}

		public int getPayback() {
			return payback;
		}

		public void setPayback(int payback) {
			this.payback = payback;
		}

	}

}
