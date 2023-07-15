package com.rays.inheritance;

public class Shape {
	
	private String colour = null;
	private int borderWidth = 0;
	
	public Shape() {
		
	}
	public Shape(String colour, int borderWidth) {
		
	this.borderWidth = borderWidth;
	this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	
	public int getBorderWidth() {
		return borderWidth;
	}
	 
}
