package com.techment.ArrayFundamentalsAssignment;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

//	2) Write a program to initialize an integer array with values and check if a given number is present in the 
//	array or not. If the number is not found, it will print -1 else it will print the index value of the given 
//	number in the array Ex1) Array elements are {1,4,34,56,7} and the search element is 90 O/P: -1 
//	Ex2)Array elements are {1,4,34,56,7}
		
		int arr[] = {2,4,5,7,9,13,16,19,21,25,33,34,38,41,44,49,52,55,56,60,67,68,69,70,73,75,76,82,85,89,93,96,99};
		System.out.println("Given Array :");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nEnter the number you want to find in the Given Array:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		boolean found = false;
		
		for(int i=0;i<arr.length;i++) {
			if(num == arr[i]) {
				found = true;
				System.out.println("Found at : " + i);
				break;
			}
		}
		
		if(!found)
			System.out.println(-1);
		scanner.close();
	}

}
