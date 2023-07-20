package com.rays.collections;

public class TryPerson {
	public static void main(String[] args) {
		
		Person p = new Person("nivi",2);
		
		Person p1 = new Person("nivi",2);
		
		Employee e1 = new Employee("nivi",2);
		
		System.out.println(p.equals(p1));
		
		System.out.println(p.hashCode());
		
		System.out.println(p1.hashCode());
		
	}

}
