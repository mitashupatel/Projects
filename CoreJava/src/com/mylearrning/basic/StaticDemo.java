package com.mylearrning.basic;

import java.util.ArrayList;
import java.util.List;


public class StaticDemo {

	int a = 5;
	static List<String> list = new ArrayList<String>();
	public StaticDemo() {
		int b = 6;
		a = 6;
		System.out.println("Cons");
	}
	{
		System.out.println("Normal Block");
	}
	static
	{
		list.add("Test");
		System.out.println("Static Block");
	}
	void test()
	{
		this.a = 7;
		StaticDemo sd = new StaticDemo();
		sd.a = 7;
		System.out.println("Test Method");
	}
	public static void main(String[] args) {
		
		StaticDemo sd = new StaticDemo();
		sd.test();
	}

}
