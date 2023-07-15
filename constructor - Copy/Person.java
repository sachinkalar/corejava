package com.rays.constructor;

public class Person extends Shape {
	
	private String name = null;
	private int id = 0;
	private String addr = null;
	 
	public Person () {
		System.out.println();
	}
	public Person(String name,int id,String addr,String colour, int borderWidth) {
		
		System.out.println(this.addr = addr);
		System.out.println(this.id = id);
		System.out.println(this.name =name);
	}

}
