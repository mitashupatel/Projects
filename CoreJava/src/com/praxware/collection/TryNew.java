package com.praxware.collection;

import java.util.Scanner;

public class TryNew {

	public static void main(String[] args) {
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter A Value of A: ");
			
			int a=sc.nextInt();
			System.out.println("Enter A Value Of B: ");
			
			double b=sc.nextDouble();
			double c;
			c=a+b;
			System.out.println("Sum is: "+ c);
			String s="Mitashu J Patel";
			System.out.println("Enter Size of array.");
			int size=sc.nextInt();
			
			String [] arr=new String[size];
			arr[0]= "hello";
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+",");
			}
	}


}