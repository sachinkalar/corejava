package com.rays.exercise;

public class AccendingArray {
	public static void main(String[] args) {
		int a=0;
		int arr [] = {1,2,44,5,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(a<arr[j]) {
					a=arr[j];
					System.out.println(a);
					
				}
			}
			
			
		}
	}

}
