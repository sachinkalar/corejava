package com.rays.interfaces;

public class Businessman implements Richman{

	@Override
	public void earnMoney() {
		int em = 100000;
		System.out.println("earnmoney per month"+em);
		
		
	}

	@Override
	public void donation() {
		int d = 10000;
		System.out.println("donation"+d);
		
		
	}

	@Override
	public void party() {
		int p = 25000;
		System.out.println("party payment"+p);
		
		
	}

}