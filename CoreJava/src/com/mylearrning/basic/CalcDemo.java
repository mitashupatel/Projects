package com.mylearrning.basic;

import java.util.Scanner;

public class CalcDemo {

	public static int[] getValueFromUser(Scanner sc) {

		System.out.println("Enter your Size");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + (i + 1) + " value");
			arr[i] = sc.nextInt();
		}

		return arr;
	}

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Addition");
		System.out.println("2. Sub");
		System.out.println("3. mult");
		System.out.println("4. div");
		System.out.println("Select any one");
		int operation = sc.nextInt();
		int arr[] = getValueFromUser(sc);
		double result = 0;
		switch (operation) {
		case 1:
			result = add(arr);
			break;
		case 2:
			result = sub(arr);
			break;
		case 3:
			result = mult(arr);
			break;
		case 4:
			result = div(arr);
			break;
		default:
			break;
		}

		System.out.println("Your Result is : " + result);

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
 
	private static double mult(int[] arr) {
		double result = 1;
		for (int i : arr) {
			result *= i; // result = result + i;
		}
		return result;
	}

	private static double sub(int[] arr) {
		double result = 0d;
		for (int i : arr) {
			result -= i; // result = result + i;
		}
		return result;
	}

	private static double add(int[] arr ) {

		double result = 0d;
		for (int i : arr) {
			if( i != 0)
				result += i; // result = result + i;
		}
		return result;
	}

}