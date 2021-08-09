package com.techment.LogicBuildingAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise29 {

	public static void main(String[] args) {
		// Write a program to accept 3 sides of a tringle and display if the tringle is a right angle tringle or not.

		Scanner scanner = new Scanner(System.in);
		int sides[] = new int[3];
		System.out.println("Enter the sides of the Triangle : ");
		for(int i=0;i<3;i++) {
			sides[i] = scanner.nextInt();
		}
		
		Arrays.sort(sides);
		int a = sides[0];
		int b = sides[1];
		int c = sides[2];
		
		if(c*c == a*a + b*b)
			System.out.println("The Triangle is right-angled triangle.");
		else
			System.out.println("The Triangle is not right-angled triangle.");
		
		scanner.close();
	}

}
