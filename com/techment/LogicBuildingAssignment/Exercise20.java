package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Exercise20 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input size of Array : ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter elements in the array :");
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the index of the item you want to find in the Array :");
		int index = scanner.nextInt();
		
		try {
			
			if(index < n)
				System.out.println("The item is : " + arr[index]);
			else
				throw new ArrayIndexOutOfBoundsException("ERROR !!! Index is out of bound.");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
