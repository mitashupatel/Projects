package com.praxware.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
	
		Set<String> set = new LinkedHashSet<String>();
		set.add("Test1");
		set.add("Test2");
		set.add("Test1");
		set.add("Test3");
		set.add("Test3");
		set.add("Test1");
		
		for (String s : set) {
			System.out.println(s);
		}
				
	}
	
}
