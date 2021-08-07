package com.techment.LogicBuildingAssignment;
import java.util.Scanner;

public class Exercise23 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Height in cm:");
		int ht = scanner.nextInt();
		System.out.println("Enter your Weight in Kg:");
		int wt = scanner.nextInt();
		
		float ht_m = (float)ht/100;
		System.out.println(ht_m);
		
		float bmi = (float)wt/(ht_m*ht_m);
		System.out.println(bmi);
		if(bmi<18.50)
			System.out.println("Underweight");
		else if(bmi>=18.50 && bmi<=25)
			System.out.println("Normal");
		else if(bmi>25 && bmi<=30)
			System.out.println("Normal");
		else
			System.out.println("Overweight");

		scanner.close();
	}

}
