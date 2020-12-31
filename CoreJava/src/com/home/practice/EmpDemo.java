package com.home.practice;

public class EmpDemo {
	private int id;
	private String name;
	private String cast;
	public EmpDemo(EmpDemo emp) {
	
	}
	public EmpDemo(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public EmpDemo (int id,String name,String cast) {
		this(id,name);
		this.cast=cast;
	}
	@Override
	public String toString() {
	return ""+id+ ":"+name+ ":"+cast;
	}
	public static void main(String[] args) {
	
		EmpDemo ed=new EmpDemo(1,"Mitashu","Patel");
		EmpDemo ed2=new EmpDemo(2,"Tony","Stark");
		System.out.println(ed.id);
		System.out.println(ed.name);
		System.out.println(ed.cast);
		System.out.println(ed);
		System.out.println(ed2);
		

	}

}
    