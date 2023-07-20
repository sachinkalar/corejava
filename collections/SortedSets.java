package com.rays.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSets {
	
	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		
		s.add("sachin");
		s.add("yogita");
		s.add("priya");
		s.add("reema");
		s.add("pooja");
		s.add("rukhmani");
		
		for(Object element : s) {
			System.out.println(element);
		}
		System.out.println("first element from output"+" "+s.first());
		System.out.println("last element from output"+" "+s.last());
		
		System.out.println("all head from given element"+s.headSet("yogita"));
		
		System.out.println(s.tailSet("priya"));
		
		System.out.println(s.subSet("priya", "sachin"));
	}

}
