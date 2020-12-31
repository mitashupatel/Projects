package com.home.practice;

import java.util.Scanner;

public class PrimeList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int pr=sc.nextInt();
		if(pr<=1) {
			System.out.println("Please Enter A Number Except Zero And One. ");
		}
		
		boolean isPrime = false; 
		for(int i=2;i<pr;i++) {
			if(pr%i==0) {
				
				isPrime=true;
			}
		}
			if(isPrime==true) {
				System.out.println("Not A Prime Number.");
			}
			else if(isPrime==false){
				System.out.println("Prime Number. ");
			}
		sc.close();	
	}
}
