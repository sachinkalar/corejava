package com.rays.clonning;

public class TestAccount {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		// shallow clonning
		
		Account a = new Account(10);
		
	  Account b = (Account) a.clone();
		
		b.balance = 12;
		System.out.println(a.balance);
		System.out.println(b.balance);
	}

}
