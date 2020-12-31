package com.mylearrning.basic;

public class ThisDemo {

	private int a;
	
	ThisDemo()
	{
		this(4);
		System.out.println("Cons called : ");
	}
	
	ThisDemo(int a)
	{
		System.out.println("param Cons called :  "+a);
	}
	void test()
	{
		//this.test1();
		System.out.println("Test Method");
		this.test1();
	}
	void test1()
	{
		System.out.println(this.a);
		System.out.println("Test1 method");
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public static void main(String[] args) {
		ThisDemo td = new ThisDemo();
		td.test();
		//td.test1();
		/*
		 * td.setA(3); System.out.println(td.getA());
		 */
	}

}
