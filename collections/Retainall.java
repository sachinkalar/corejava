package com.rays.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Retainall {
	
	public static void main(String[] args) {
		
		Collection box = new ArrayList();
		
		box.add("pen");
		box.add("pencil");
		box.add("rubber");
	
       Collection bag = new ArrayList();
       bag.add("pen");
       bag.add("shapner");
       
       
       box.retainAll(bag);
       System.out.println(box);
	}
}
