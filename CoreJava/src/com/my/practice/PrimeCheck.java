package com.my.practice;
import java.util.Scanner;


public class PrimeCheck {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number To Check");		
		int j=sc.nextInt();
		int i;
		
		for(i=2;i<j;i++) {
			if(j%i ==0) {
				
				int arr[]=new int[i];
				
				
				/*
				 * have to make a code for if one time j ' moduelo with i is zero then it will
				 * print only one time.
				 */
				int arr1[]=new int[i];
				if(i>1) {
					System.out.println("Entered Number Is not prime");
					
				}
			}
				else if(j%i !=0){
					System.out.println("Number Is prime");
					continue;
					
				}
			
			}	
	
	}	
	}