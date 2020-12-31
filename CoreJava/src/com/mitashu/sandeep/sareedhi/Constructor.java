package com.mitashu.sandeep.sareedhi;

public class Constructor {
	int id;
	String name;
	int age;
	
	Constructor(){
		System.out.println("This is Normal Constructor.");
	}
	Constructor(int i,String n){
		id=i;
		name=n;
		
	}
	Constructor(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void display() {
		System.out.println("Id Name  Age");
		System.out.println(id +" "+ name+" "+age);
	}
	
	public static void main(String args[]) {
		Constructor c=new Constructor();
		Constructor c1=new Constructor(1,"Mitashu");
		Constructor c2=new Constructor(1,"Mitashu",22);
		c1.display();
		c2.display();
	}
}
