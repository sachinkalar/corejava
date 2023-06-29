package com.rays.basics;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=11;
		int count=2;
		for(int i=2;i<=n-1;i++) {
			
	if(n%i==0)
	{
		count++;
	}if(count==2) {
		System.out.println("prime number");
	}else {
		System.out.println("not prime number");
	}

}}
}