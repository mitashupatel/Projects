package com.my.newpractice;

public class SecondHighest{
	public static void main(String args[]){

		int[] arr = {30, 50, 200, 85, 9};	
		int max=arr[0];
		int smax=arr[0];

		for(int i=0;i<arr.length;i++)
		{	
		if(arr[i]>max) {	
			max=arr[i];
			if(arr[i]>smax ) {
				if(smax<max) {
				smax=arr[i];
				}
			}
		
		  }
		
		}

		System.out.println(smax);
		
   }
}