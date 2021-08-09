package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
//		 Use a loop to continuously check for the PIN number and keep repeatedly ask the 
//		 customer to enter PIN until he enters the correct PIN.

		Scanner scanner = new Scanner(System.in);

		int actualPIN = 12345;
		
		while(true) {
			System.out.println("Enter your 5 digit PIN : ");
			int enteredPIN = scanner.nextInt();
			
			if(enteredPIN == actualPIN) {
				System.out.println("Successfull !! You enterd the correct PIN.");
				break;
			}
			else
				System.out.println("Wrong PIN !! Please enter the correct PIN.");
				continue;
		}
		scanner.close();
	}

}
