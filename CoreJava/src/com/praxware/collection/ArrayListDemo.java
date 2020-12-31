package com.praxware.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		String s = "Test3";
		ArrayList<String> list = new ArrayList<>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test4");
		list.add("Test2");
		list.add("Test1");
		
		if(!list.contains("Test3"))
		list.add("Test3");
		list.remove(2);
		/*
		 * Iterator<Integer> it = list.iterator(); while (it.hasNext()) { Integer i =
		 * (Integer) it.next(); System.out.println(i); }
		 */
		
		for (String i : list) 
		{
			System.out.println(i); 
			
		}
		 
		
		//System.out.println(list.get(1));
		
		/*
		 * int size = list.size(); //7 int i = 0; while (i < size) { String data =
		 * list.get(i); System.out.println(data); i++; }
		 */
		
		
		
		
		
	}
	
}
