package com.home.practice;

import java.util.Scanner;
class SizeChecker extends Exception{
	public SizeChecker(String msg) {
		super(msg);
	}
}
public class ThrowsTwo {

	public static void main(String[] args) throws SizeChecker{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array:|");
	int size=sc.nextInt();
	
	if(size>=11) {
		throw new SizeChecker("Your Array Size Is Larger.");
	}
	
	int arr[]=new int[size];
	for(int i=0; i<arr.length;i++) {
		System.out.println("Enter "+ i +" value: ");
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}
}