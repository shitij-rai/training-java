package com.techment.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		
		
		try {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.println("num1/num2 = " + num1/num2);
		}
		catch(InputMismatchException e) {
			System.out.println("Enter numbers as Integer only.");
		}
		catch(ArithmeticException e) {
			System.out.println("Don't divide by zero.");
		}
		
		scanner.close();
	}

}
