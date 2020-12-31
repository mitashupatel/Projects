package com.praxware.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MeDemo {

	public static void main(String[] args) {
		System.out.println("Here You Will Get A list of students with there Enrollment No");
		Set<String> st = new LinkedHashSet<String>();

		st.add("Hariom");
		st.add("Jainee");
		st.add("Mitashu");
		st.add("Mitashu");

		for (String mj : st) {
			System.out.println(mj);
		}

		Set<Integer> ar = new TreeSet<Integer>();

		ar.add(7029);
		ar.add(7016);
		ar.add(7059);
		for (Integer en : ar) {
			System.out.println(en);
		}

		Set<String> jj = new HashSet<String>();
		jj.add("160160107029");
		jj.add("160160107016");
		jj.add("160160107059");

		for (String er : jj) {
			System.out.println(er);
		}

	}
}
