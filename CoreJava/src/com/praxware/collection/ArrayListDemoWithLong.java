package com.praxware.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemoWithLong {

	public static void main(String[] args) {
		
		List<Long> list = new ArrayList<Long>();
		list.add(1234567891025L);
		list.add(1234567891025L);
		list.add(1234567891025L);
		list.add(1234567891025L);
		
		for (Long long1 : list) {
			System.out.println(long1);
		}
	}

}
