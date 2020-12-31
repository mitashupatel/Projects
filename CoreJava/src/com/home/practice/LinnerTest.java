package com.home.practice;

import java.util.Scanner;

public class LinnerTest {
	public static void FindFlase(boolean result) {
		if(result==false) {
			System.out.println("Number Is not in list.");
		}
	}
	public static void FindData (int i ,int arr[], boolean result) {
		
			if(result==true) {
				System.out.println("Your Number Is: "+arr[i]);
				System.out.println("Index Number is: "+(i));
				
				}
				
							}
							
		
	public static void main(String[] args) {
		boolean result=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of your Data Array: ");
		int data=sc.nextInt();
		int [] arr= new int[data];
		if(data>12) {
			System.out.println("Enter A Lower Value Than 12. ");
		}
		else {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+(i+1) + "value");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			int j;
			
			for( j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Data Entered.");
					
				}
			}
			
			
		}
		for(int i=0;i<arr.length;i++) {
			if( i<=0) {
				System.out.println("Your Data: ");
				
			}
			System.out.print(arr[i]+" ");
			System.out.println();
		}
		System.out.println("Enter A Data Number You want to search. ");
		int finder=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == finder) {
			result=true;
			FindData(i,arr, result);
			break;
			}
			
				
			}
		if (result==false) {
			System.out.println("No in not in list");
		}
		/*for(int i=0;i<arr.length;i++) {
			if(arr[i]!= finder) {
				result=false;
				FindFlase(result);
				break;
			}
			}*/
		}
		
		
		}
		
	}
