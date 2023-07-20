package com.rays.collections;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	
	public static void main(String[] args) {
		
		
		Set s = new HashSet();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		
		for(Object Object: s)
			System.out.println(Object);
		
		System.out.println(s);
	}

}
