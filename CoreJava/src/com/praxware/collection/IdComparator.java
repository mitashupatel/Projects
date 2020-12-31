package com.praxware.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Mitashu J Patel
 *
 */
public class IdComparator implements Comparator<Student> {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(2);
		s1.setFname("f1");
		s1.setLname("l1");
		
		Student s2 = new Student();
		s2.setId(4);
		s2.setFname("f2");
		s2.setLname("l2");
		
		Student s3 = new Student();
		s3.setId(1);
		s3.setFname("f3");
		s3.setLname("l3");
		
		Student s4 = new Student();
		s4.setId(3);
		s4.setFname("f4");
		s4.setLname("l4");
		
		
		Student s5 = new Student();
		s5.setId(5);
		s5.setFname("f1");
		s5.setLname("l1");
		
		ArrayList<Student> stList = new ArrayList<>();
		stList.add(s1);
		stList.add(s2);
		stList.add(s3);
		stList.add(s4);
		stList.add(s5);
		
		Collections.sort(stList, new IdComparator());
		
		for (Student s : stList) {
			System.out.println(s.getId()+" : "+s.getFname());
		}
		
	}

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.getId() > o2.getId())
			return 1;
		else if(o1.getId() < o2.getId())
			return -1;
		else
		return 0;
	} 

}
