package com.my.practice;

import java.util.Scanner;

public class NewTry {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your First Value Below");
		int a=sc.nextInt();
		System.out.println("Enter Your Second Value Below");
		int b=sc.nextInt();
		
		
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		if(a==b) {
			System.out.println("A and B is Equal.");
		}
		else {
			if(a>b) {
				System.out.println("A is Large No");
				}
			else{
				System.out.println("B is Large No.");
			}
		}
		String s="hello";
		
		System.out.println(s);
		
		
		System.out.println("Select  Case 1 Or 2 : ");
		int swo=sc.nextInt();
		
		switch (swo) {
		case 1:
				System.out.println("You Entered No 1.");
			break;
		case 2: System.out.println("You have entered a larger no than 1");
			break;

		}
		
		
		sc.close();
	}

}
