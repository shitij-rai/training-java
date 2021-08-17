package com.techment.OopsAssignment;

import java.util.Scanner;

class Book{
	
	private int bookNo;
	private String title , author;
	private float price;
	
	public Book(int bookNo, String title, String author, float price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

class EngineeringBook extends Book{
	
	private String category;

	public EngineeringBook(int bookNo, String title, String author, float price, String category) {
		super(bookNo, title, author, price);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

public class Question2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Book No. , Title , Author , Price of the Book : ");
		
		Book book = new Book(scanner.nextInt() , scanner.next() , scanner.next() , scanner.nextFloat() );
		System.out.println("Book No. : " + book.getBookNo());
		System.out.println("Book Title : " + book.getTitle());
		System.out.println("Book Author : " + book.getAuthor());
		System.out.println("Book Price : " + book.getPrice());
		
		System.out.println("Enter Book No. , Title , Author , Price and Category of the Engineering Book : ");
		EngineeringBook engineeringBook = new EngineeringBook(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextFloat(), scanner.next());
		
		System.out.println("Book No. : " + engineeringBook.getBookNo());
		System.out.println("Book Title : " + engineeringBook.getTitle());
		System.out.println("Book Author : " + engineeringBook.getAuthor());
		System.out.println("Book Price : " + engineeringBook.getPrice());
		System.out.println("Book Category : " + engineeringBook.getCategory());
		
		scanner.close();
	}

}
