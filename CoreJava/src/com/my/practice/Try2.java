package com.my.practice;

import java.util.Scanner;

public class Try2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First No:  ");
	int a=sc.nextInt();
	System.out.println("Enter Second No: ");
	int b=sc.nextInt();
	int c=a+b;
	System.out.println("Addition is: "+c);
	
	System.out.println("Enter No to check Even or Odd. ");
	int d=sc.nextInt();
	if(d % 2 == 0) {
		System.out.println("Entered No Is Even.");
		}
	else {
		System.out.println("No is Odd.");
	}
	
	
	
	
	}

}
