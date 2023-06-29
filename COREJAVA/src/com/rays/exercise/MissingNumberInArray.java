package com.rays.exercise;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4};
		int suma = 0;
		for(int num :a) {
			suma=suma+num;
			
		}
		int sumb=0;
		for(int num: b) {
			sumb=sumb+num;
		}
		int array=suma-sumb;
		System.out.println(array);
		
	}

}
