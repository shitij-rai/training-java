package com.techment.ArrayFundamentalsAssignment;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

//		4)Java Program to merge two arrays in to one
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of array1 : ");
		int n = scanner.nextInt();
		int arr1[] = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Element " + (i+1) + " : ");
			arr1[i] = scanner.nextInt();
		}
		
		System.out.println("Enter size of array2 : ");
		int m = scanner.nextInt();
		int arr2[] = new int[m];
		for(int i=0;i<m;i++) {
			System.out.println("Enter Element " + (i+1) + " : ");
			arr2[i] = scanner.nextInt();
		}
		
		int arr3[] = new int[n+m];
		
		for(int i=0;i<n;i++) {
			arr3[i] = arr1[i];
		}
		for(int i=0;i<m;i++) {
			arr3[n+i] = arr2[i];
		}
		
		System.out.println("The Merged array is : ");
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i] + " ");
		}
		scanner.close();
	}

}
