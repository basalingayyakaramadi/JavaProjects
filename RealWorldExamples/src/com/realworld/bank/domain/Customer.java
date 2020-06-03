package com.realworld.bank.domain;

import com.realworld.bank.bean.CustomerBean;

public class Customer extends CustomerBean{
	Customer(String Name,String address,int phoneNumber,String email ){
		super.setName(Name);
		super.setAddress(address);
		super.setEmail(email);
		super.setPhoneNumber(phoneNumber);
	}
}
