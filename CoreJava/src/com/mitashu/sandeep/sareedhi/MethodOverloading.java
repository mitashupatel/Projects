package com.mitashu.sandeep.sareedhi;

import java.util.Scanner;

public class MethodOverloading {
		static void add(int n,String name) {
			System.out.println("Your Id: " +" "+ n + " Name is: "+name);
		}
		static void add(int n,String name, int age) {
			System.out.println("Your Id: " +" "+ n + " Name is: "+name +" & Your Age "+age);
		}
		public static void main(String args[]) {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter Id Name & Age");
			 
			 int i=sc.nextInt();
			 String n=sc.next();
			 int a=sc.nextInt();
			 MethodOverloading.add(i,n);
			 MethodOverloading.add(i,n,a);
			
			
		}
}
