package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {

//		 Use try, catch and finally to handle ArithmeticException which is raised as a result of 
//		 division by zero .
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Integer 1 : ");
		int a = scanner.nextInt();
		System.out.println("Enter Integer 2 : ");
		int b = scanner.nextInt();
		
		try {
			System.out.println("Integer1/Integer2 = " + (a/b));
		}
		catch(ArithmeticException e) {
			System.out.println("Don't Divide By Zero.");
		}
		finally {
			System.out.println("Inside finally block.");
		}
		scanner.close();
	}

}
