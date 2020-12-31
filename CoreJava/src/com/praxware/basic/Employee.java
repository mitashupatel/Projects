package com.praxware.basic;

import java.io.Serializable;

public class Employee implements Serializable {

	private int id;
	private String fname;
	transient private String lname;
	
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
	public String toString() {
		// TODO Auto-generated method stub
		return "id : "+getId()+" fname : "+getFname()+" lname : "+getLname();
	}
	
}
