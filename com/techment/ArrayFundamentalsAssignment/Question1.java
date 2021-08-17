package com.techment.ArrayFundamentalsAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
//		1)Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array : (size of array should be atleast 4)");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Element " + (i+1) + " : ");
			arr[i] = scanner.nextInt();
		}
		
		int lowest,highest,second_highest,second_lowest;
		Arrays.sort(arr);
		highest = arr[n-1];
		second_highest = arr[n-2];
		second_lowest = arr[1];
		lowest = arr[0];
		
		System.out.println("Highest Element is : " + highest);
		System.out.println("Second Highest Element is : " + second_highest);
		System.out.println("Second Lowest Element is : " + second_lowest);
		System.out.println("Lowest Element is : " + lowest);
		
		scanner.close();
	}

}
