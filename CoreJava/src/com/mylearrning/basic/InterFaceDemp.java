package com.mylearrning.basic;

import java.util.Scanner;

public class InterFaceDemp {

	public static void main(String[] args) {
			
		 int a;
		int b;
		int result;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("ENTER A NUMBER 1");
		a=sc.nextInt();
		
		System.out.println("ENTER A NUMBER 2");
		b=sc.nextInt();
		
		result=a+b;
		System.out.println("Sum OF A & B is    "+result);
		
		sc.close();
		System.out.println("Tell Me About YourSelf");
	}
}