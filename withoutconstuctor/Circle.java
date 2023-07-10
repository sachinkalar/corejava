package com.rays.withoutconstuctor;

public class Circle extends Shape {
	
	private int radius = 0;
	
	

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		 double ar = 3.14*(radius*radius);
		 System.out.println(ar);
		 return ar;
	}


	}


