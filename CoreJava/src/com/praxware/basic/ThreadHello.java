package com.praxware.basic;

public class ThreadHello extends Thread{
 
	@Override
	public void run() {
		
		
		for(int i=1; i<=17; i++)
		{
			System.out.println("OutPut is here:"+i);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		ThreadHello t1= new ThreadHello();
		ThreadHello t2= new ThreadHello();
		ThreadHello t3= new ThreadHello();
		ThreadHello t4= new ThreadHello();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
