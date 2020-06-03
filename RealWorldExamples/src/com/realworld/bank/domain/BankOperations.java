package com.realworld.bank.domain;

import com.google.gson.Gson;
import com.realworld.bank.util.AccountTypes;

public class BankOperations extends Account{
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		Bank b = new Bank();
		b.AddBranch("e121","E-City","Bangalore");
		Branch br = new Branch();
		br.openAccount("e121",AccountTypes.Saving,500.00,new Customer("Praveen","ecity",123,"gmail"));
		System.out.println("Account opened:");
		System.out.println(gson.toJson(br.GetAccount("Praveengmail")));
		br.creditAmount("Praveengmail", 300);
		System.out.println("Amount Credited:");
		System.out.println(gson.toJson(br.GetAccount("Praveengmail")));
		b.AddBranch("m121","Marathalli","Bangalore");
		System.out.println("Branch List:");
		System.out.println(gson.toJson(b.GetAllBranches()));	
		System.out.println("Account List:");
		System.out.println(gson.toJson(br.getAccountList()));
	}
}
