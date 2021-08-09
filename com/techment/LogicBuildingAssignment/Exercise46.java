package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Exercise46 {

	 static int fact(int n) {
		
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {

//		Write a Java program to find the sum of the series 
//		1/1! + 2/2! + 3/3! + ……1/N!
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of term in serires : ");
		int n = scanner.nextInt();
		
		float sum=0;
		
		for(int i=1;i<=n;i++) {
			sum += (float)i/fact(i);
		}
		System.out.println("Sum of series : " + sum);

		scanner.close();
	}

}
