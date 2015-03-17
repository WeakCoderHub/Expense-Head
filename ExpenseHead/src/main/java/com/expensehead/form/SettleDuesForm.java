package com.expensehead.form;

public class SettleDuesForm {
	
	int settleDuesAmount;
	
	String settleDuesDescription;
	
	public int getContributionAmount() {
		return settleDuesAmount;
	}
	public void setContributionAmount(int settleDuesAmount) {
		this.settleDuesAmount = settleDuesAmount;
	}
	
	public String getContributionDescription() {
		return settleDuesDescription;
	}
	public void setContributionDescription(String settleDuesDescription) {
		this.settleDuesDescription = settleDuesDescription;
	}
	
}
