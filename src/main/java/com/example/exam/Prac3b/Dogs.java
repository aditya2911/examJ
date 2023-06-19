package com.example.exam.Prac3b;

public class Dogs extends Animals {

	
	protected Dogs(int l, String animalName) {
		super(l, animalName);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs Dogs = new Dogs(4,"Tommy");
		System.out.println(Dogs.display());
	}

	@Override
	String eat() {
		// TODO Auto-generated method stub
		return super.name+" eats";
	}

}
