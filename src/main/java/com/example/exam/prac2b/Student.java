package com.example.exam.prac2b;

public class Student implements StudentInterface {



	@Override
	public String displayMarks() {
		// TODO Auto-generated method stub
		return "TOTAL MARKS";
	}

	
	public static void main(String args[]) {
		Student s = new Student();
		System.out.print(s.displayMarks());
	}
}
