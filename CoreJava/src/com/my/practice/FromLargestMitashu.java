package com.my.practice;

import java.util.*;


public class FromLargestMitashu {

	static void fromLargest(Vector<String> arr)
	{
	
		Collections.sort(arr, new
						Comparator<String>(){

		@Override
		public int compare(String X, String Y) {

		String XY=X + Y;
		String YX=Y + X;
		
		return XY.compareTo(YX) > 0 ? -1:1;
	}
	});
		
	Iterator it = arr.iterator();

	while(it.hasNext())
		System.out.print(it.next());
	
	}

	public static void main (String[] args) 
	{
		
		Vector<String> arr;
		arr = new Vector<>();
		
	
		arr.add("12");
		arr.add("34");
		arr.add("75");
		arr.add("98");
		fromLargest(arr);
	}
	
	
	
}
