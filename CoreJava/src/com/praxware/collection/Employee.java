package com.praxware.collection;

public class Employee implements Comparable<Employee> 
{
	
	private int id;
	private String fname;
	private String lname;
	private int salary;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public int compareTo(Employee o) {
		
		if(this.getSalary() > o.getSalary())
		{
			return 1;
		}
		else if(this.getSalary() < o.getSalary())
		{
			return -1;
		}
		return 0;
	}
	
}
