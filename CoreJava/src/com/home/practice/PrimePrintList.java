package com.home.practice;

import java.util.Scanner;

public class PrimePrintList {


	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Numner Till which you want a prime number list.");
		int a=sc.nextInt();
		int temp=0;
		for(int i=1;i<=a;i++) {
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					temp++;
				}
				
			}
			if(temp==0) {
				System.out.println(i);
			}
			else {
				temp=0;
			}
		}
		sc.close();

	}

}
