package com.my.practice;

import java.util.Scanner;

public class HighetNoInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		int max=arr[0];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			/*System.out.println(arr[i]);*/
		}
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		System.out.println("Sum " + sum);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Highest No "+max);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				
				System.out.print(arr[i]+",");
				
			}
		}
	}

}
