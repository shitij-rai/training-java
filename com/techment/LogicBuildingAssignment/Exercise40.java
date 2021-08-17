package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Exercise40 {

	public static void main(String[] args) {

//		Create two dimensional array to 
//		store the values of n*n matrix and using 
//		nested for loop and using nested for loop 
//		find out the mirror image of the matrix and 
//		display in the given format.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of Rows and Columns:");
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int a[][] = new int[m][n];
		int mirror_a[][] = new int[m][n];
		
		System.out.println("Enter the elements of the Matrix:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("The Original Matirx :");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mirror_a[i][n-1-j] = a[i][j];
			}
		}
		
		System.out.println("The Mirror Image :");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mirror_a[i][j] + "\t");
			}
			System.out.println();
		}
		scanner.close();
		
	}

}
