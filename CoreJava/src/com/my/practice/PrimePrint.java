package com.my.practice;

import java.util.Scanner;

public class PrimePrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number To Check");		
		int j=sc.nextInt();
		int i;
		
		for(i=2;i<j;i++) {
			if(j%i ==0) {
				
				System.out.println("Entered Number Is not prime");
					
				}
			
				else {
					
					
					System.out.println(i);
				}
			
			}	
	
	
	
	}
}
