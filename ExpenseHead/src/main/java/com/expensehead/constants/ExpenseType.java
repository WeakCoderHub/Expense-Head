package com.expensehead.constants;

import java.util.List;

public class ExpenseType {

	List<String> commonExpenseType;
	List<String> adminExpenseType;

	public List<String> getCommonExpenseType() {
		return commonExpenseType;
	}

	public void setcommonExpenseType(List<String> commonExpenseType) {
		this.commonExpenseType = commonExpenseType;
	}

	public List<String> getAdminExpenseType() {
		return adminExpenseType;
	}

	public void setAdminExpenseType(List<String> adminExpenseType) {
		this.adminExpenseType = adminExpenseType;
	}
}
