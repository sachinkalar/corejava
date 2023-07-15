package com.rays.oops;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class MainMethods {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = "26/11/2023";
	Person p = new Person();
	 
	p.setName("naman");
	p.setName("address");
	p.setAddr("panchor");
	p.setDob(sdf.parse(str));
	
	System.out.println(p.getName());
	System.out.println(sdf.format(p.getDob()));
	System.out.println(p.getAddr());
	
	
    
	
	
		
		
	}

}
