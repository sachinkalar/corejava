package com.rays.constructor;

public class Shape {
	 private String colour = null;
	 private int borderWidth = 0;
	 
	 public Shape() {
		 
		 System.out.println("the shape is");
		 
		 
	 }
	 public Shape(String colour, int borderWidth) {
		 
		System.out.println( this.borderWidth = borderWidth);
		System.out.println( this.colour = colour);
	 }

}
