package com.rays.withoutconstuctor;

public class Triangle extends Shape {
	private int base = 0;
	private int heigth  = 0 ;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setheigth(int heigth) {
		this.heigth = heigth;
	}
	 public double area() {
		 
		 double ar = (heigth*base)/2;
		 System.out.println("area of triANGLE = "+ar);
		return ar;
		 
	 }

}
