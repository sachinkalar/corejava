package com.rays.withoutconstuctor;

public class Rectangle extends Shape {
	
	private int length = 0;
	private int width = 0;
	
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public double area() {
		
		int ar =length*width;
		System.out.println(ar);
		return ar;
		
		
	}


}
