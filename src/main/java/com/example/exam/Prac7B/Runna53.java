package com.example.exam.Prac7B;

public class Runna53 implements Runnable{

	@Override
	public void run() {
	for(int i =0;i<20;i++) {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
	}
	public static void main(String args[]) {
		Thread t1 = new Thread(new Runna53());
		Thread t2 = new Thread(new Runna53());

		Thread t3 = new Thread(new Runna53());

		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.NORM_PRIORITY);
		
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
