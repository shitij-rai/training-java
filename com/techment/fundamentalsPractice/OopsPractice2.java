package com.techment.fundamentalsPractice;

class Customer{
	int id,contact,minBalance;
	String name;
	
	Customer(String name,int id,int contact,int minBalance) {
		this.name = name;
		this.id = id;
		this.contact = contact;
		this.minBalance = minBalance;
	}
	
	public void displayDetails() {
		System.out.println("Customer Name : " + name);
		System.out.println("Customer id : " + id);
		System.out.println("Customer Contact : " + contact);
		System.out.println("Customer Minimum-Balance : " + minBalance +"\n");	
	}
	
	public void checkAccountType() {
		if(minBalance == 0)
			System.out.println("Zero Balance Account" + "\n");
		else if(minBalance == 1000)
			System.out.println("Savings Account" + "\n");
		else if(minBalance == 10000)
			System.out.println("Current Account" + "\n");
		else
			System.out.println("Enter valid Minimum Balance" + "\n");
	}
}

public class OopsPractice2 {

	public static void main(String[] args) {
		
		Customer john = new Customer("John", 1234, 147528309, 5);
		Customer mike = new Customer("Mike", 5678, 147555559, 10000);
		Customer paul = new Customer("Paul", 8888, 123456789 , 1000);
		
		john.displayDetails();
		john.checkAccountType();
		mike.displayDetails();
		mike.checkAccountType();
		paul.displayDetails();
		paul.checkAccountType();
		
	}

}
