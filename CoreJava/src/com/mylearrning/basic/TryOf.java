package com.mylearrning.basic;

import java.util.Scanner;

public class TryOf {

	public static int[] getvaluefromuser(Scanner sc){
	
		System.out.println("Enter Your Size");
		int size=sc.nextInt();
		int [] arr=new int[size];
		
		for(int i=0;i< arr.length; i++) 
		{
			System.out.println("Enter  "  +(i+1)+  "  Value");
			arr[i]=sc.nextInt();
		}
		return arr;
		
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("1: Addition");
		System.out.println("2: SubStraction");
		System.out.println("3: Multiply");
		System.out.println("4: Division");
		
		int operation= sc.nextInt();
		int arr[]=getvaluefromuser(sc);
		double result=0;
		switch(operation) {
		case 1:
			result = add(arr);
			break;
		case 2:
			result = sub(arr);
			break;
		case 3:
			result = mul(arr);
			break;
		case 4:
			result = div(arr);
			break;
		default:
			break;
		}
				System.out.println("Your Result Is:"+result);
	
	}

	private static double add(int[] arr) {
		
		double result=0d;
		for(int i:arr) {
			result +=i;
		}
		return result;
	}

	private static double sub(int[] arr) {
		double result=0d;
		for(int i:arr) {
			result -=i;
		}
		return result;
	}

	private static double mul(int[] arr) {
		double result=1d;
		for(int i:arr) {
			result *=i;
		}
		return result;
	}

	private static double div(int[] arr) {
		double result = 0.0d;
		for (int i = 0; i < arr.length; i++) {
			if(result != 0)
			{
				result /= arr[i];
			}
			else
			{
				result = arr[i];
			}
			
		}
		return result;
	}

}
