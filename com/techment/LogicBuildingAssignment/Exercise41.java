package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Exercise41 {

	public static void main(String[] args) {
		
//		Create a stack with push and pop methods , 
//		The elements should be stored in an array with a 
//		fixed maximum stack size of 5 elements. Push 5 
//		elements and pop all the elements . Should allow pop 
//		only from top.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of elements you want to push into the stack (Maximum 5 elements) : ");
		int n = scanner.nextInt();
		
		int stack[] = new int[n];
		
		System.out.println("Enter elements to push :");
		for(int i=0;i<n;i++) {
			stack[i] = scanner.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("Item popped is : " + stack[n-1-i]);
		}
		
		scanner.close();
	}

}
