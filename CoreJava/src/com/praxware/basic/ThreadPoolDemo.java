package com.praxware.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable
{

	String msg = "";
	
	public Worker(String msg) {
		this.msg = msg;
	}

	
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() +"(Starts) : " +msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +"(End) : " +msg);
		
	}
	
}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		
		ExecutorService exc = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i < 10; i++) {
			
			Runnable r = new Worker(""+i);
			exc.execute(r);
			
		}
		
	}

}
