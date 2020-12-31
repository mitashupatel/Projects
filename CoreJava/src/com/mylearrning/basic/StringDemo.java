package com.mylearrning.basic;

public class StringDemo {

	public static void main(String[] args) {
		
		String s = "Test";
		String s1 = "Test";
		String s2 = new String("Test");
		String s3 = new String("Test");
		String s4 = new String("TEST");
		
		System.out.println("s == s1 : "+(s == s1));
		System.out.println("s1 == s2 : "+(s1 == s2.intern()));
		System.out.println("s2 == s3 : "+(s2 == s3));
		
		System.out.println("s equals s1 : "+(s.equals(s1)));
		System.out.println("s1 equals s2 : "+(s1.equals(s1)));
		System.out.println("s2 equals s3 : "+(s2.equals(s3)));
		
		System.out.println("s3 equals s4 : "+(s3.equalsIgnoreCase(s4)));
		
	}

}
