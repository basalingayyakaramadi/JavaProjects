package com.realworld.bank.domain;

import java.util.ArrayList;

import com.realworld.bank.bean.AccountBean;
import com.realworld.bank.util.AccountTypes;

public class Account extends AccountBean{
	
	ArrayList<Customer> customers = new ArrayList();
	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	

	public boolean addCustomer(Customer customer) {
		if(this.isExistingCustomer(customer)) {
			return false;
		}
		this.customers.add(customer);
		return true;
	}
	
	public boolean removeCustomer(int phoneNum) {
		boolean res = false;
		for(Customer cs:this.customers) {
			if(cs.getPhoneNumber()==phoneNum) {
				this.customers.remove(cs);
				res = true;
				break;
			}
		}
		return res;
	}
	
	public boolean isExistingCustomer(Customer customer) {
		for(Customer cs:this.customers) {
			if(cs.getPhoneNumber()==customer.getPhoneNumber()) {
				return true;
			}
		}
		return false;
	}
}
