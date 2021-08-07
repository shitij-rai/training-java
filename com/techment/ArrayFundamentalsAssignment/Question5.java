package com.techment.ArrayFundamentalsAssignment;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
//		5)matrix addition in 2 dimensional array

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of Rows and Columns:");
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int a[][] = new int[m][n];
		int b[][] = new int[m][n];
		int sum[][] = new int[m][n];
		
		System.out.println("Enter the elements of First Matrix:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter the elements of Second Matrix:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Sum of First and Second Matrix : ");
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(sum[i][j] + "\t");
			}
			System.out.println();
		}
		scanner.close();
	}

}
