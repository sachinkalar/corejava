package com.rays.collections;



public class Person {
	
	private String name = null;
	private int id = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Person(String name,int id) {
		this.id = id;
		this.name = name;
		
	}
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Person)) {
			return false;
			
		}
	  
		Person p = (Person) obj;
		boolean b = this.id == p.id && this.name ==p.name;
		
		return b;
	}
	@Override
	public int hashCode() {
		 String str = this.name+this.id;
		return str.hashCode();
	}
	

}
