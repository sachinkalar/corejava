package com.rays.oops;

public class TestAccount {
	public static void main(String[] args) {
		 
		Account a = new Account();
		
		a.setAccountNum(997702);
		a.setAccountType("saving");
		a.setBalance(1000);
		a.setDeposite(500);
		a.setWithdrawl(600);
		
		
		System.out.println(a.getAccountType());
		System.out.println(a.getAccountNum());
		System.out.println(a.getBalance());
		System.out.println(a.getDeposite());
		System.out.println(a.getWithdrawl());
	}

}
