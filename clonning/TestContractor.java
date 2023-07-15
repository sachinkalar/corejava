package com.rays.clonning;

public class TestContractor {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Contractor c = new Contractor("sachin");
		
		Contractor c1 = (Contractor) c.clone();
	}

}
