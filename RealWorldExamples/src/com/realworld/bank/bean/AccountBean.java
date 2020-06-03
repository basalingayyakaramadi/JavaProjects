package com.realworld.bank.bean;

import com.realworld.bank.util.AccountTypes;

public class AccountBean {
	String accNo;
	double balance;
	AccountTypes type;
	String dateOfOpening;
	double min_balance;
	String branchCode;
	
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public AccountTypes getType() {
		return type;
	}
	public void setType(AccountTypes type) {
		this.type = type;
	}
	public String getDateOfOpening() {
		return dateOfOpening;
	}
	public void setDateOfOpening(String string) {
		this.dateOfOpening = string;
	}
	public double getMin_balance() {
		return min_balance;
	}
	public void setMin_balance(double min_balance) {
		this.min_balance = min_balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
}
