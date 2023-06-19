package com.example.exam.Prac6A;

public class Thread_Extended53  extends Thread{
	private int threadNumber;

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			
		}catch(InterruptedException e) {
			
		}
		System.out.println(this.getName());
	}
	public Thread_Extended53(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[])  {
		Thread_Extended53[ ] t = new Thread_Extended53[5];
		
		for(int i =0;i<5;i++) {
		t[i] = new Thread_Extended53(i+"");
		t[i].start();
	}
		
		try {
			
			for(int i =0;i<5;i++) {
			while(t[i].isAlive()) {
				t[i].join();
			}
			System.out.println("Thread " + i + " terminated");

		}
			
		}
		
		catch(InterruptedException e) {
			
		}

		
	}

}
