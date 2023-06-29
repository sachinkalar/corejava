package com.rays.exercise;

public class Fibonacci {
	public static void main(String[] args) {
		int n=11;
		int first=0;
		int second=1;
		int temp=0;
		
		for(int i=1;i<=n;i++) {
			temp=first+second;
			System.out.print(temp+" ");
			
			second=first;
			first=temp;
		}
	}

}
