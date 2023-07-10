package com.rays.withoutconstuctor;

public class Shape {
	private String colour = null;
	private int borderWidth = 0;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;

	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;

	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public double area() {
		System.out.println("shape area");
		return 0;
	}

}