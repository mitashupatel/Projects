package com.mylearrning.basic;

import java.io.FileWriter;
import java.io.IOException;

public class FileWri {

	private static FileWriter fw1;
	private static FileWriter fw2;
	private static FileWriter fw3;
	private static FileWriter fw4;
	private static FileWriter fw5;

	public static void main(String[] args) {
	 try {
		fw1 = new FileWriter("D:\\mj.txt");
		fw2= new FileWriter("D:\\mj1.txt");
		fw3= new FileWriter("D:\\mj2.txt");
		fw4= new FileWriter("D:\\mj3.txt");
		fw5= new FileWriter("D:\\mj4.txt");
		
	fw1.write("Hey Hi helloo from 1 to 5");
	fw2.write("Hey Hi helloo from 1 to 5");
	fw3.write("Hey Hi helloo from 1 to 5");
	fw4.write("Hey Hi helloo from 1 to 5");
	fw5.write("Hey Hi helloo from 1 to 5");
	
	fw1.close();
	fw2.close();
	fw3.close();
	fw4.close();
	fw5.close();
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}

	}

}
