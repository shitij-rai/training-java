package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Exercise35 {

	public static void main(String[] args) {

//		1
//		12
//		123
//		1234
//		12345
//		123456
//		1234567
//		123456
//		12345
//		1234
//		123
//		12
//		1

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}			
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
