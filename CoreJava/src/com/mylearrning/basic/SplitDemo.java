package com.mylearrning.basic;

public class SplitDemo {

	public static void main(String[] args) {
		
		String date = "dd-MM-yyyy";
		String[] splt = date.split("-");
		for (String s : splt) {
			System.out.println(s);
		}
		String new_date = splt[2]+"/"+splt[1]+"/"+splt[0];
		System.out.println(new_date);
		

	}

}
