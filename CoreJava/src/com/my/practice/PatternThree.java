package com.my.practice;

import java.util.Scanner;

public class PatternThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Enter Raw Lines :");
		int r=sc.nextInt();
		System.out.println("Enter Column Lines :");
		int c=sc.nextInt();
		for(i=0;i<=r;i++) {
			for(j=c;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
sc.close();
	}

}
