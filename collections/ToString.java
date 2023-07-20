package com.rays.collections;

public class ToString {
	
	private int id = 0;
	private String name = null;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ToString(int id, String name) {
		this.id = id;
		this.name = name;
		
	}@Override
	public String toString() {
		
		return id+" "+name ;
	
		
	}
	
	
		
		
	}
	
		
		
	
	
	
		



