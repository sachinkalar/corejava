package com.rays.inheritance;

public class Rectangle extends Shape {

	private int width = 0;
	private int length = 0;

	public Rectangle() {

		System.out.println();
	}

	public Rectangle(int width, int length) {

		this.length = length;

		this.width = width;

	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

}
