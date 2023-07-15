package com.rays.clonning;

public class TestCustomer {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c = new Customer("sachin");
		
		Customer c1 = (Customer) c.clone();
		
		c1.name = "naman";
         c1.account.balance = 220;	
         
         System.out.println(c1.name);
         System.out.println(c1.account.balance);
         
         System.out.println(c.name);
         System.out.println(c.account.balance);

}
}