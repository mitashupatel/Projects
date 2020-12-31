package com.home.practice;

import java.util.Scanner;

public class PrimeNumberPrinter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			for (int j = 2; j < i-1; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
			else {
				count=0;
			}
		}
		sc.close();
	}

}
