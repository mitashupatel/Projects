package com.my.practice;

import java.util.Scanner;

public class LinnearSearch {

		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size Of Array.");
		int size=sc.nextInt();
		int [] arr=new int[size];
			 
		for(int i=0; i<arr.length;i++) {
				System.out.println("Enter the "+ (i + 1) + "Value");
				arr[i]=sc.nextInt();
				
			}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
		System.out.println();
		}
		System.out.println("Enter a number to find in list. ");
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) 
			{
				System.out.println("Number Is in list.");
				System.out.println("That Number is Stored On "+i+ "index.");
			}
			else {
				System.out.println("Number Is Not in List. ");
				break;
			}
		}
		sc.close();
	}

}