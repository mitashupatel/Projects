package com.praxware.basic;
class Stud{
static	int rollno;
static	String name;
static	Float fee;
 Stud(int r,String n ,Float f) {
    rollno=r;
    name=n;
	fee=f;
	
	}
	
 void studcall() {
	System.out.println(" rollno "+rollno+" name "+name+" fees "+fee);
}}
public class ThisDemo1 {
	
public static void main(String[] args) {
	Stud s=new Stud(1,"jane",5000f);
    s.studcall();
}
}
