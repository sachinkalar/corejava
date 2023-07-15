package com.rays.oops;

public class TestAutomobile {
	public static void main(String[] args) {
		
		Automobile a = new Automobile();
		a.setColour("black");
		a.setMake("sachin");
	
		a.setSpeed(300);
		a.breck(23);
		a.changegear(3);
		a.acceletore(12);
		
		System.out.println(a.getColour());
		System.out.println(a.getMake());
		System.out.println(a.getSpeed());
		
		
		
	}

}
