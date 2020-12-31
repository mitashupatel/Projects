package com.praxware.collection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyWriteDemo {

	public static void main(String[] args) {
		
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test4");
		list.add("Test2");
		list.add("Test1");
		
		/*
		 * if(!list.contains("Test3")) list.add("Test3");
		 */
		/*
		 * Iterator<Integer> it = list.iterator(); while (it.hasNext()) { Integer i =
		 * (Integer) it.next(); System.out.println(i); }
		 */
		
		for (String i : list) 
		{
			System.out.println(i); 
			list.add("Tttt");
		}
		
	}
}
