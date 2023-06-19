package com.example.exam.Prac7A;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Thread t = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int i =2;i<=100;i=i+2) {
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(i);
					}
				}
			});
			
			t.start();
	}

}
