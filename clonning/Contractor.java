package com.rays.clonning;

public class Contractor implements Cloneable {
	
	String name  =null;
	
	Account account = null;
	
	public Contractor(String name) {
		this.name = name;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Contractor c =  (Contractor) super.clone();
		
		account = (Account) account.clone();
		return c;
		
	}

}
