package com.mylearrning.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SeqIn {

	public static void main(String[] args) throws IOException {
		FileInputStream m1=new FileInputStream("D:\\mj.txt");
		FileInputStream m2=new FileInputStream("D:\\mj1.txt");
		FileInputStream m3=new FileInputStream("D:\\mj2.txt");
		FileInputStream m4=new FileInputStream("D:\\mj3.txt");
		FileInputStream m5=new FileInputStream("D:\\mj4.txt");
		
		FileOutputStream fo=new FileOutputStream("D:\\Here lie a Doby - A free Elf.txt");
		SequenceInputStream sq=new SequenceInputStream(m1,m2);
		SequenceInputStream sw=new SequenceInputStream(m3,m4);
		/*SequenceInputStream sm=new SequenceInputStream(sq,sw) {*/
		/*int i=sw.read();
		while(i != -1) {
			i= sw.read();
			
		}*/
		int i;
		while((i=sq.read())!= -1) {
			fo.write(i); 
	
		}
		sq.close();
		
		i = 0;
		while((i=sw.read())!= -1) {
			fo.write(i); 
	
		}
		sw.close();
		/*
		 * sw.close(); sm.close();
		 */
		fo.close();
		m1.close();
		m2.close();
		m3.close();
		m4.close();
		m5.close();

		
		System.out.println("IT IS DONE!!!!");
	}

}