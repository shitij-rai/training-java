package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Excercise45 {

	public static void main(String[] args) {

//		create a variable to store the auctual
//		pin code number as 12345. and accept the pin 
//		from user using a while loop to compare the pin 
//		entered with the auctual pin code. If matches 
//		shows PIN Accepted. Only 3 attempts are 
//		allowed.
		
		Scanner scanner = new Scanner(System.in);
		int correct_PIN = 12345;
		int entered_PIN;
		
		int i=1;
		while(i<=3) {
			System.out.println("ENTER PIN : ");
			entered_PIN = scanner.nextInt();
			
			if(entered_PIN == correct_PIN) {
				System.out.println(" PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
				break;
			}
			else
			{
				System.out.println("WRONG PIN ENTERED. " + (3-i) + " Attempt(s) remaining.");
			}
			i++;
			if(i==4)
				System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
		}
		
		scanner.close();
	}

}
