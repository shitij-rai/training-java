package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Exercise34 {

	public static void main(String[] args) {

//		7654321
//		765432
//		76543
//		7654
//		765
//		76
//		7
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();
	}

}
