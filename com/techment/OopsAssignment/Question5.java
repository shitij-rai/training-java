package com.techment.OopsAssignment;

abstract class Medicine{
	
	int price;
	String expiryDate;
	
	public Medicine(int price, String expiryDate) {
		super();
		this.price = price;
		this.expiryDate = expiryDate;
	}

	void getDetails() {
		System.out.println("Price : " + price + " --- Expiry Date : " + expiryDate);
	}
	
	abstract void displayLabel();
}

class Tablet extends Medicine{
	
	public Tablet(int price, String expiryDate) {
		super(price, expiryDate);
	}
	
	@Override
	void displayLabel() {
		System.out.println("Tablets to be stored in cold and dry place.");
	}
}

class Syrup extends Medicine{
	
	public Syrup(int price, String expiryDate) {
		super(price, expiryDate);
	}

	@Override
	void displayLabel() {
		System.out.println("Syrup to be stored in cold temperature.");
	}
}

class Ointment extends Medicine{
	
	public Ointment(int price, String expiryDate) {
		super(price, expiryDate);
	}

	@Override
	void displayLabel() {
		System.out.println("Ointments are for external use only.");
	}
}
public class Question5 {

	public static void main(String[] args) {

		Medicine medicines[] = new Medicine[5];
		
		
		for(int j=0;j<5;j++) {
			int i = (int)(Math.random()*3 +1);
			if(i==1) {
				System.out.println("Tablets " + (j+1) + " :");
				medicines[j] = new Tablet(240, "June 2022");
				medicines[j].getDetails();
				medicines[j].displayLabel();
			}
			else if(i==2) {
				System.out.println("Syrup :" + (j+1) + " :");
				medicines[j] = new Syrup(360, "November 2025");
				medicines[j].getDetails();
				medicines[j].displayLabel();
			}
			else {
				System.out.println("Ointments :" + (j+1) + " :");
				medicines[j] = new Ointment(70, "December 2021");
				medicines[j].getDetails();
				medicines[j].displayLabel();
			}
			System.out.println();
		}
	}

}
