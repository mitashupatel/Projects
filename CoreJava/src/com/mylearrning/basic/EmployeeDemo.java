package com.mylearrning.basic;

public class EmployeeDemo {

	private int id;
	private String name;
	private String add;
	EmployeeDemo(EmployeeDemo emp)
	{
		
	}
	EmployeeDemo(int id, String name)
	{
		//this(this);
		this.id = id;
		this.name = name;
	}
	EmployeeDemo(int id, String name, String add)
	{
		this(id, name);
		this.add = add;
	}
	@Override
	public String toString() {
		return ""+id+" : "+name+" : "+add; 
	}
	public static void main(String[] args) {

		
		 EmployeeDemo ed = new EmployeeDemo(1, "Bijesh","Ahmd"); 
		 EmployeeDemo ed1 =new EmployeeDemo(11, "Bijesh1","Ahmd1"); 
		 System.out.println(ed.id);
		 System.out.println(ed.name); 
		 System.out.println(ed); 
		 System.out.println(ed1);
		
		/*String s = "Abc";
		System.out.println(s.hashCode());*/
	}

}
