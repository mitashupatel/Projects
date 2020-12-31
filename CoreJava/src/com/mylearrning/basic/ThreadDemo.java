package com.mylearrning.basic;

class Table {

	static void getDetails(int n) throws InterruptedException
	{
		 synchronized(Table.class) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+(n*i));
			Thread.sleep(10);
		}
		 }
	}
}

class Thread1 extends Thread {
	/*
	 * Table t; Thread1(Table t) { this.t = t; }
	 */
	@Override
	public void run() {

		try {
			Table.getDetails(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Thread2 extends Thread {
	/*
	 * Table t; Thread2(Table t) { this.t = t; }
	 */
	@Override
	public void run() {

		try {
			Table.getDetails(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class ThreadDemo {

	public static void main(String[] args) {

		// Table t = new Table();
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
	
		t1.start();
		t2.start();
	}

}
