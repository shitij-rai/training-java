package com.techment.LogicBuildingAssignment;
import java.util.Scanner;
public class Exercise12 {

	public static void main(String[] args) {
		// 
		//		  5 
		//		4 5 4 
		//	  3 4 5 4 3 
		//	2 3 4 5 4 3 2 
		//1 2 3 4 5 4 3 2 1
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The bumber of lines:");
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			
			for(int k=n-i+1;k<=n-1;k++) {
				System.out.print(k + " ");
			}
			
			for(int l=5;l>5-i;l--) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
