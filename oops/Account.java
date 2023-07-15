package com.rays.oops;

public class Account {
	
	private int balance =0;
	private int deposite =0;
	private int withdrawl = 0;
	private String accountType = null;
	private int accountNum = 0;
	
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getDeposite() {
		return deposite;
	}
	public void setDeposite(int deposite) {
		this.deposite =getBalance()+ deposite;
		
	}
	public int getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(int withdrawl) {
		this.withdrawl =getDeposite()- withdrawl;
	}
	
	
     
     
}
