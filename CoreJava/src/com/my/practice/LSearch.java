package com.my.practice;


import java.util.Scanner;

public class LSearch {
			
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Size");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i + 1) + " value");
			arr[i] = sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
			System.out.println();
		}
		System.out.println("Enter A Number To find.");
		int n=sc.nextInt();	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("This "+ n +" Number is in list.");
			}
			else {
				System.out.println("This "+ n + " is not in list.");
				
			}
		sc.close();
		}
	}

}
