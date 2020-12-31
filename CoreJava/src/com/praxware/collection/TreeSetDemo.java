package com.praxware.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
	Set<Integer> set = new TreeSet<Integer>();
	set.add(7);
	set.add(10);
	set.add(3);
	set.add(2);
	set.add(1);
	set.add(9);
	set.add(4);
	set.add(5);
	
	for (Integer i : set) {
		System.out.println(i);
	}
		
	}

}
