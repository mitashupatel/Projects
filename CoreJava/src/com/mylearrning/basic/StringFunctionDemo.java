package com.mylearrning.basic;

public class StringFunctionDemo {

	public static void main(String[] args) {
		
		String s = "Praxware";
		String s1 = " Technology";
		String a = "D";
		String b = "a";
		
		
		
		System.out.println(s.charAt(0));
		System.out.println(s.concat(s1));
		System.out.println(a.compareTo(b));
		System.out.println(s.contains("ax"));
		System.out.println(s.endsWith("ware1"));
		System.out.println(s.indexOf("w"));
		System.out.println(s.isEmpty());
		System.out.println(s.matches("^[a-zA-Z]*$"));
		System.out.println(s.replace("ware", "abc"));
		String s2 = s.replace("ware", "abc");
		System.out.println(s.substring(2));
		//System.out.println(s.);
	}

}
