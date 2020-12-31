// this class is for testing
package com.praxware.basic;


public class Hello {

	public static void main(String[] args) {
		
		System.out.println("Hello : "+args[0]+", "+args[0]);
		main(1);
	}

	public static void main(int a) {
		System.out.println("Hello1 "+a);
	}
}
