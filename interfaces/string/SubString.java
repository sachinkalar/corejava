package com.rays.string;

public class SubString {
	public static void main(String[] args) {
		String name = "Shiv parvati";
		System.out.print(name.length());
		System.out.println(name.charAt(6));
		System.out.println("10 character is"+" " +name.charAt(10));
		System.out.println(name.indexOf("parvati"));
		System.out.println(name.lastIndexOf("v"));
		System.out.println(name.replace("v","b"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("par"));//true or false
		System.out.println(name.endsWith("ti"));
		System.out.println(name.substring(6));
		
		
	}

}

