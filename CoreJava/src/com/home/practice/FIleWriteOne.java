package com.home.practice;

import java.io.FileWriter;
import java.io.IOException;

public class FIleWriteOne {
		
	private static FileWriter fw1;
	
	public static void main(String[] args) {
		boolean result;
		try {
			fw1=new FileWriter("C:\\Users\\Mitashu J Patel\\Desktop\\01.txt");
			for(int i=0;i<10;i++) {
			fw1.write("I Am Mitashu J Patel\n");
			fw1.write("Hey Hello I Am Mitashu J Patel 123\n");
			}
			fw1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			}

}
