package com.lavi.naveen;

public class Account {
	
	String acctHolName;
	String acctType;
	
	public Account() {}
	public Account(String acctHolName, String acctType) {
		super();
		this.acctHolName = acctHolName;
		this.acctType = acctType;
	}
	
	public String getAcctHolName() {
		return acctHolName;
	}
	public void setAcctHolName(String acctHolName) {
		this.acctHolName = acctHolName;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	
	

}
