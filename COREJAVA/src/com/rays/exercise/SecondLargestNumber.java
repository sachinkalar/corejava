package com.rays.exercise;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[]arr={10,100,30,24,111,40};
		int mini=0;
		int maxi=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxi) {
			mini=maxi;
			maxi=arr[i];
		}
		if(arr[i]<maxi&&arr[i]>mini) {
			mini=arr[i];
			}
		
	}System.out.print("  "+mini);

	}

}
