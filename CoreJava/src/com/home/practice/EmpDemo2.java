 
package com.home.practice;

public class EmpDemo2 {
	private int id;
	private String name;
	private String address;
	private static boolean result=true;
public  EmpDemo2(int id,String name,String address,boolean result) {
	this.id=id;
			this.name=name;
			this.address=address;
			this.result=result;
}
@Override
	public String toString() {
		return id+ ": "+name+ ": "+address+": "+result;
}
	public static void main(String[] args) {
		EmpDemo2 em=new EmpDemo2(1,"Mitashu","Arjanvav",result);
		System.out.println(em.id);
		System.out.println(em.name);
		System.out.println(em.address);
		System.out.println(em.result);
		System.out.println(em);
		
		int c=9876+5;
		System.out.println("Your Answer: "+c);
	}	
}
