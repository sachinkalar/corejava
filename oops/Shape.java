package com.rays.oops;

public class Shape {
	private String colour = null;
	private int border = 0;
	
	public void setColour(String s) {
		colour =s;
	}
	
    public String getColour() {
    	return colour;
    }
    
    public void setBorder(int n) {
     border = n;
    }
    public int getBorder() {
    	return border;
    }
}
