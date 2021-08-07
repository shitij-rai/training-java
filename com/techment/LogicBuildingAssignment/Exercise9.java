package com.techment.LogicBuildingAssignment;
import java.util.Scanner;
public class Exercise9 {

	public static void main(String[] args) {
		// First n terms in a series
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number n upto which you want to print the series:");
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++) {
			if(i!=n)
				System.out.print((i*i*i) + " ,");
			else
				System.out.print((i*i*i) + ".");
		}
		
		scanner.close();
	}

}
