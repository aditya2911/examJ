package com.example.exam.prac2A;

public class Book extends Author{

	private String bookName;
	Book(String auth,String book) {
		super(auth);
		this.bookName = book;
		

	}

	
	String display() {
		return "book name :"+this.bookName+" Author name :"+this.author;
	}


	public static void main(String args []) {
		Book b = new Book("Aditya Salunke","lord of rings");
		System.out.println(b.display());
	}
}
