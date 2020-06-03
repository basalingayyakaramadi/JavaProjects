package com.realworld.bank.domain;

import java.util.ArrayList;

public class Bank {
	ArrayList<Branch> branches = new ArrayList();
	
	public void AddBranch(String brCode, String brName, String city) {
		this.branches.add(this.createBranch(brCode,brName,city));
	}
	
	public Branch createBranch(String brCode, String brName, String city) {
		Branch br =  new Branch();
		br.setBranchCode(brCode);
		br.setBranchName(brName);
		br.setCity(city);
		return br;
	}
	
	public boolean RemoveBranch(Branch branch) {
		boolean res = false;
		this.branches = this.GetAllBranches();
		for(Branch br:this.branches) {
			if(br.getBranchCode().equals(branch.getBranchCode())) {
				this.branches.remove(br);
				res = true;
				break;
			}
		}
		return res;
	}
	
	public Branch GetBranch(String branchCode) {
		Branch br1 = null;
		for(Branch br:this.branches) {
			if(br.getBranchCode().equals(branchCode)) {
				br1 = br;
			}
		}
		System.out.println("Selected Branch>>"+br1);
		return br1;
	}
	public ArrayList<Branch> GetAllBranches() {
		return branches;
	}
}
