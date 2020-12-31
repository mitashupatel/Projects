package com.home.practice;

import java.util.Scanner;

class AgeValidation extends Exception{
	AgeValidation(String msg){
		super(msg);
	}
}
public class ThrowsDemo {

	public static void main(String[] args) throws AgeValidation {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age.");
		int age=sc.nextInt();
		int arr[]=  new int[age];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter "+i+" value:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		if(age>8) {
			throw new AgeValidation("Not A Valid Age.!");
		}
		System.out.println("Your Age: "+age);
	}

}
