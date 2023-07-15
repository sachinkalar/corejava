package com.rays.oops;

public class Automobile {
	private String colour = null;
	private int speed = 0;
	private String make = null;
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed =speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public  void breck(int b) {
		int br = b;
		speed = speed-br;
	}
	public  void changegear(int c) {
		speed = speed-c;
	}
	public void acceletore(int ac) {
		speed = speed+ac;
	}

}
