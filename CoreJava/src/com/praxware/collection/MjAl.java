package com.praxware.collection;

import java.util.ArrayList;
import java.util.List;

public class MjAl {
	
	public static void getMyinfo(List<ANew>list){
		
		for(ANew m:list) {
			System.out.println("EN_NO:  "+m.getEnno()+ "   " + "Branch:  "+m.getBranch()+ "    "+  "CPI:  "+m.getCpi() );
		}
		
	}
	public static void main(String[] args) {
		
		
		ANew m1 = new ANew();
		m1.setEnno(1);
		m1.setBranch("Computer");
		m1.setCpi(6.2);
		
		
		ANew m2 = new ANew();
		m2.setEnno(2);
		m2.setBranch("Computer");
		m2.setCpi(8.6);
 
		ANew m3 = new ANew();
		m3.setEnno(1);
		m3.setBranch("Computer");
		m3.setCpi(6.2);
		
		ArrayList<ANew> info =new ArrayList<ANew>();
		info.add(m1);
		info.add(m2);
		info.add(m3);
		
		getMyinfo(info);
		
	}

}
