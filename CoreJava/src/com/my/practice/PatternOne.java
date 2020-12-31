package com.my.practice;

import java.util.Scanner;

public class PatternOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<k;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}
