package com.rays.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterators {
	
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("ghanshyam");
		c.add("radheshyam");
		c.add("shiv");
		c.add("narayan");
		c.add("satya");
		c.add("laxmi");
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
			
			
		}
		
		
	}
	


}
