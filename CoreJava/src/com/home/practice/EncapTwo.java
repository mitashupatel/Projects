package com.home.practice;

public class EncapTwo {

	public static void main(String[] args) {
			EnapOne en=new EnapOne();
			en.setId(1);
			en.setFirstName("Mitashu");
			en.setLastName("Patel");
			en.setAddress("Arjanvav");
			en.setMobile("9409153856");
			en.setGender("Male");
			System.out.println(en.getFirstName()+" "+en.getLastName()+" "+" "+en.getAddress()+
					" "+en.getMobile()+" "+en.getGender());
	}

}
