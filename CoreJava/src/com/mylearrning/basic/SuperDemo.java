package com.mylearrning.basic;

import java.io.Serializable;

class Bike1
{
	int speed = 100;
	Bike1()
	{
		System.out.println("Bike1 Cons");
	}
	void test1()
	{
		System.out.println("Bike1 Method");
	}
	
}
class Bike2 extends Bike1
{
	int speed = 200;
	Bike2()
	{
		super();
		System.out.println("Bike2 Cons");
	}
	void test()
	{
		super.test1();
		System.out.println(speed);
		System.out.println(super.speed);
	}
}

public class SuperDemo implements Serializable {

	public static void main(String[] args) {

		Bike2 b2 = new Bike2();
		b2.test();
		System.out.println(b2.getClass());
		
		
	}

}
