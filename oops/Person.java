package com.rays.oops;
import java.util.Date;

public class Person {
	
	private String name =null;
	private Date dob = new Date();
	private String addr = null;
	public static final int AVG_AGE = 22;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	

	
	
	

}
