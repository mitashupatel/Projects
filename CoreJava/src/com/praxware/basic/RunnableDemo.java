package com.praxware.basic;

public class RunnableDemo implements Runnable {

	public static void main(String[] args) {
		
		RunnableDemo rd = new RunnableDemo();
		
		Thread t1 = new Thread(rd);
		Thread t2 = new Thread(rd);
		
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}

