package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
// 		Write a program to accept a number from the user and display the multiplication table for that number

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to display its multiplication table : ");
		int num = scanner.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num + " * " + i +" = " + num*i);
		}
		scanner.close();
	}

}
