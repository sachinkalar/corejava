package com.rays.oops;

public class SumOOps {
	public static void main(String[] args) {
	
		//Sum(32,76);
		//max(23,76);
		//AddLastName("nmn");
		 Table(10);
			
	}
	public static int Sum(int a,int b) {
		
	  int c=a+b;
		
	  System.out.println(c);
	return c;
	  
	}
	public static int max(int a ,int b) {
		if(a>b) {
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}
		return 0;	
	}
	public static String AddLastName(String s) {
		String str= new String();
		str = s+"kalar";
		System.out.println(str);
				
		return str;
		
	}
	public static int Table(int a) {
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				int d=i*j;
				System.out.print(d+"\t");
				
			}System.out.println();
		
	
		
	}
		return 0;
	

}
}