package com.rays.exercise;

public class Palindrome {
	public static void main(String[] args) {
		int n =121;
		int sum=0;
		int r;
		int arm=n;
		
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}if(arm==sum) {
			System.out.println("number is palindrome");
		}
	}

}
