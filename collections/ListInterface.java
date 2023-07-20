package com.rays.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(0, 101);
		l.add(1, 212);
		l.add(2,112);
		l.add(3, "satish");
		
		System.out.println(l);
		
		l.get(1);
		
		System.out.println(l.set(1, 221));
		System.out.println(l);
		
		System.out.println(l.indexOf("satish"));
		
		System.out.println(l.lastIndexOf("rohan"));
		
		System.out.println(l.subList(1, 4));
		
	}

}
