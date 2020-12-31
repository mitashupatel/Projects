package com.home.practice;

class s1{
	public void add()
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		s2.add();
	}
}
class s2{
	public static void add() {
		System.out.println("10");
		System.out.println("12");
		System.out.println("13");
		System.out.println("14");
		s3.add();
	}
}
class s3{
	public static void add() {
		System.out.println("20");
		System.out.println("21");
		System.out.println("22");
		try {
			System.out.println(2/0);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
public class ExceptionOne {

	public static void main(String[] args) {
		
		s1 s=new s1();
		s.add();
		System.out.println("Welcome");
	}

}
