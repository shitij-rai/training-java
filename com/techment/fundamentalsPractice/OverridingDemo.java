package com.techment.fundamentalsPractice;

class Bank{
	
	public void rateOfInterest() {
		System.out.println("3%");
	}
	
	public void openAccount() {
		System.out.println("Above 18 age can Open Account");
	}
}

class Sbi extends Bank{
	
	@Override
	public void rateOfInterest() {
		System.out.println("5%");
	}
	
	public void loan() {
		System.out.println("You can apply for Loan");
	}
}

class Axis extends Bank{
	
	public void rateOfInterest() {
		System.out.println("7%");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {

//		Sbi sbi = new Sbi();
//		sbi.rateOfInterest();
//		sbi.loan();
		
		
		Bank bank = new Sbi();  // Upcasting  
		bank.rateOfInterest();
		
	}

}
