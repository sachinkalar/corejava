package com.rays.exercise;

public class AvgOfOddNum {
	public static void main(String[] args) {
		int n= 10;
		int sum=0;
		int avg;
		int count=0;
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				sum=sum+i;
				count++;
			}
		}
		avg=sum/count;
				
			
		
		
		System.out.print(avg);

}}
