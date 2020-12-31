package com.mitashu.sandeep.sareedhi;

public class StringMethods {
	public static void main(String args[]) {
		String name="Mitashu";
		String name2="Patel";
		int n=189;
		int m=85264;
		System.out.println(name.charAt(0));
		System.out.println(name.codePointAt(1));
		System.out.println(name.compareTo(name2));
		System.out.println(name.concat(" Patel"));
		System.out.println(name.contains("i"));
		System.out.println(name.endsWith("shu0"));
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(name.hashCode());
		System.out.println(name.length());
		System.out.println(name.replace("M", "J"));
		System.out.println(name.trim());
		System.out.println(name.toUpperCase());
		System.out.println(name2.toLowerCase());
		String j=String.valueOf(n);
		String b=Integer.toString(m);
		System.out.println(m);
		System.out.println(j.length());
		System.out.println(j);
		System.out.println(b.concat("Hi"));
		System.out.println(j);
	}
}
