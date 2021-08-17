package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Exercise36 {
	
	public static void main(String[] args) {
		
//		1234554321
//		1234 4321
//		123 321
//		12 21
//		1 1

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			if(i!=1)
				System.out.print(" ");
			for(int k=n-i+1;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		scanner.close();
	}
}
