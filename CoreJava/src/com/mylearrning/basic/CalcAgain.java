package com.mylearrning.basic;

import java.util.ArrayList;
import java.util.List;

public class CalcAgain {

	static void listCompare()
	{
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		list1.add(31);
		list1.add(22);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(30);
		list2.add(21);
		List<Integer> list = new ArrayList<Integer>();
		int aCounter = 0;
		int bCounter = 0;
		for (int i = 0; i < list1.size(); i++) {
			
			if(list1.get(i) < list2.get(i))
			{
				aCounter++;
			}
			else if(list1.get(i) > list2.get(i))
			{
				bCounter++;
			}
		}
		list.add(aCounter);
		list.add(bCounter);
		
	}
	
	public static void main(String[] args) {

		int ar1_ct = 0;
		int ar2_ct = 0;
		int arr1[] = { 12, 13, 1 };
		int arr2[] = { 1,2,4 };
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > arr2[i]) {
				ar1_ct++;

			} 
			else if (arr1[i] < arr2[i]) {

				ar2_ct++;

			}
			

		}

		System.out.println("The Result of alices " + ar1_ct);
		System.out.println("The Result of Bob    " + ar2_ct);
	}
	
	
	 	
}
