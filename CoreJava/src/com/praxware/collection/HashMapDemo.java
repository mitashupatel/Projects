package com.praxware.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {
	 
	
	public static void main(String[] args) { 
		
		String words = "Sheth Bijesh Bijesh Sheth Test Test Bijesh Test test Test";
		String[] str = words.split(" ");
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		for (String s : str) {
			
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
			{
				map.put(s, 1);
			}
		
		
		}
		
		/*
		 * Set set = map.entrySet(); Iterator it = set.iterator(); while (it.hasNext())
		 * { Map.Entry<String, Integer> m = it
		 * 
		 * }
		 */
		
		
		for (Map.Entry<String, Integer> m : map.entrySet()) {
		 System.out.println(m.getKey()+" : "+m.getValue());
		 }
		
	}

}
