package com.techment.ArrayFundamentalsAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

//		3)Write a program in take 10 integer in an array and sort in ascending order.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 numbers to store in an array:");
		int arr[] = new int[10];
		
		for(int i=0;i<10;i++) {
			System.out.println("Enter Number " + (i+1) + " : ");
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("The sorted array is :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
			scanner.close();
		}
	}

}
