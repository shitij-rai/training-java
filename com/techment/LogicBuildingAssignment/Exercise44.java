package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Exercise44 {

	public static void main(String[] args) {
		// Find area of traingle using Heron's Formula
		
		Scanner scanner = new Scanner(System.in);
		int sides[] = new int [3];
		
		System.out.println("Enter the sides of the triangle as integer : ");
		for(int i=0;i<3;i++) {
			sides[i] = scanner.nextInt();
		}

		float a = sides[0];
		float b = sides[1];
		float c = sides[2];
		
		float s = (a+b+c)/2;
		
	    double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	    System.out.println("Area of triangle : " + Area);
		
	    scanner.close();
	}

}
