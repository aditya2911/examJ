package com.example.exam.Prac6A;

public class Thread53  extends Thread{

	int iterator;
	
	Thread53(String n){
		this.setName(n);;
		this.iterator = 10;
	}
	@Override
	public void run() {
		System.out.println("name : "+this.getName());
		for(int i =0;i<this.iterator;i++) {
			System.out.println("value : "+i);
			try {
				this.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String args[]) {
		Thread53 t = new Thread53("Aditya");
		t.start();
		System.out.println(t.isAlive());
				
	}
	
}
