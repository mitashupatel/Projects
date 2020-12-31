package com.praxware.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setSalary(5000);

		Employee e2 = new Employee();
		e2.setId(3);
		e2.setSalary(15000);
		
		Employee e3 = new Employee();
		e3.setId(4);
		e3.setSalary(25000);
		
		Employee e4 = new Employee();
		e4.setId(2);
		e4.setSalary(1000);
		
		Employee e5 = new Employee();
		e5.setId(5);
		e5.setSalary(10000);
		
		Set<Employee> list = new HashSet<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		//Collections.sort(list);
		
		for (Employee e : list) {
			System.out.println(e.getId() +" : "+e.getSalary());
		}
	}

}
