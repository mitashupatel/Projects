package com.praxware.basic;
class ThreadDemo extends Thread{

	@Override
	public void run() {
		
		for (int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() +" : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	} 
	public static void main(String[] args) throws InterruptedException {
		
		ThreadDemo t1 = new ThreadDemo();
		t1.setName("t1");
		ThreadDemo t2 = new ThreadDemo();
		t2.setName("t2");
		ThreadDemo t3 = new ThreadDemo();
		t3.setName("t3");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
	}
}
