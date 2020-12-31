package com.praxware.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedDemo {
	
	public static void main(String[] args) throws Exception {
		
		Employee e = new Employee();
		e.setId(1);
		e.setLname("Sheth");
		e.setFname("Bijesh");
		
		FileOutputStream fos = new FileOutputStream("obj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("Done");
		
		FileInputStream fis = new FileInputStream("obj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e1 =(Employee) ois.readObject();
		System.out.println(e1);
		
		
	}

}
