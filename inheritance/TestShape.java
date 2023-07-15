package com.rays.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape("Red", 12);
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColour());

		Rectangle r = new Rectangle(4, 3);
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColour());

	}
}