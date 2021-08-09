package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Exercise37 {

	public static void main(String[] args) {

//	     1
//	 	212
//	   32123
//	  4321234
//	 543212345
//	  4321234
//	   32123
//		212
//		 1

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			for(int l=2;l<=i;l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		
		for(int i=1;i<=n-1;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=n-i;j>=1;j--) {
				System.out.print(j);
			}
			for(int k=2;k<=n-i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		scanner.close();
	}

}
