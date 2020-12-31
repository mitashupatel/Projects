package com.praxware.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
	
	public static void getDetails(List<Student> list)
	{
		
		for (Student st : list) {
			System.out.println("Id : "+st.getId()+" name : "+st.getFname());
		}
		
	}
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setFname("f1");
		s1.setLname("l1");
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setFname("f2");
		s2.setLname("l2");
		
		Student s3 = new Student();
		s3.setId(3);
		s3.setFname("f3");
		s3.setLname("l3");
		
		Student s4 = new Student();
		s4.setId(4);
		s4.setFname("f4");
		s4.setLname("l4");
		
		
		Student s5 = new Student();
		s5.setId(1);
		s5.setFname("f1");
		s5.setLname("l1");
		
		
		ArrayList<Student> sscList = new ArrayList<>();
		sscList.add(s1);
		sscList.add(s2);
		
		ArrayList<Student> hscList = new ArrayList<>();
		hscList.add(s3);
		hscList.add(s4);
		
		//list.remove(2);
		hscList.addAll(0,sscList);
		//getDetails(sscList);
	   				
		getDetails(hscList);
		
	}

}
