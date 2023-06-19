package com.example.exam.Prac5A;

public class Child1 extends Super1{

	@Override
	String display() {
		
		try {
			throw new Exception();

		}
		catch(Exception e ) {
			System.out.println("test");
			
		}
		return "Aditya";
	
		
	}
	
	public static void main(String args []) {
		Child1 c = new Child1();
		System.out.println(c.display());
	}
	
	
	
}
