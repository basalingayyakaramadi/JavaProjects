package com.realworld.bank.domain;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.realworld.bank.bean.BranchBean;
import com.realworld.bank.util.AccountTypes;

public class Branch extends BranchBean {
	
	private ArrayList<Account> accounts = new ArrayList();
	
	public boolean AddAccount(Account account) {
		this.accounts.add(account);	
		return true;
	}
	
	public void removeAccount(String accountNumber) {
		
	}
	public Account createAccount(String brCode,AccountTypes type,double minBalance, Customer customer) {
		Account ac = new Account();
		 DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	     Date dateobj = new Date();
		ac.setAccNo(customer.getName()+customer.getEmail());
		ac.setBalance(minBalance);
		ac.setDateOfOpening(df.format(dateobj));
		ac.setType(type);
		ac.setBranchCode(brCode);
		return ac;
	}
	public boolean openAccount(String brCode,AccountTypes type,double minBalance, Customer customer) {
		Account ac = new Account();
		ac.addCustomer(customer);
		return this.AddAccount(this.createAccount(brCode,type, minBalance,customer));
	}
	
	public void RemoveAccount(String accno) {
		for(Account ac:this.accounts) {
			if(ac.getAccNo().equals(accno)) {
				this.accounts.remove(ac);
			}
		}
	}
	
	public Account GetAccount(String accno) {
		Account custAcc = null;
		for(int i=0;i<this.accounts.size();i++) {
			if(this.accounts.get(i).getAccNo().equals(accno)) {
				custAcc = this.accounts.get(i);
			}
		}
		return custAcc;
	}
	
	public ArrayList<Account> getAccountList() {
		Account custAcc = null;
		for(int i=0;i<this.accounts.size();i++) {
				custAcc = this.accounts.get(i);
		}
		return this.accounts;
	}
	
	public boolean creditAmount(String accountNumber, double amount) {
		for(int i=0;i<this.accounts.size();i++) {
			if(this.accounts.get(i).getAccNo().equals(accountNumber)) {
				double bal = this.accounts.get(i).getBalance();
				bal = bal + amount;
				this.accounts.get(i).setBalance(bal);
				return true;
			}
		}
		return false;
	}
	public boolean debitAmount(String accountNumber, double amount) {
		for(int i=0;i<this.accounts.size();i++) {
			if(this.accounts.get(i).getAccNo().equals(accountNumber)) {
				double bal = this.accounts.get(i).getBalance();
				bal = bal - amount;
				this.accounts.get(i).setBalance(bal);
				return true;
			}
		}
		return false;
	}
}
