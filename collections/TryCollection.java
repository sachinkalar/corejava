package com.rays.collections;

import java.util.ArrayList;

import java.util.Collection;

public class TryCollection {
	
	public static void main(String[] args) {
		
		
		Collection c = new ArrayList();
		
		c.add(12);
		c.add(32);
		c.add(43);
		c.add(21);
		
		Collection c1 = new ArrayList();
		
		c1.add("rambharose");
		c1.add("seera");
		c1.add(12);
		
		//c1.addAll(c);
		//System.out.println(c1);
		
		//System.out.println(c.contains(32));
		
		//System.out.println(c1.containsAll(c));
		
	    //System.out.println(c1);
		//System.out.println(c.isEmpty());
		
		//System.out.println(c.remove(12));
		//System.out.println(c);
		
        //c.removeAll(c);
        //System.out.println(c);
		
	  c.retainAll(c1);
	   System.out.println(c);
		
		//System.out.println(c.size());
		

	}

}
