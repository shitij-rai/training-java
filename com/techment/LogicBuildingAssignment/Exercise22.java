package com.techment.LogicBuildingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Names you want to enter :");
		int n = scanner.nextInt();
		
		System.out.println("Enter the names: ");
		
		ArrayList<String> namesList = new ArrayList<String>(n);
		for(int i=0;i<n;i++) {
			namesList.add(scanner.next());
		}
		
		Collections.sort(namesList);
		System.out.println("Sorted Names : " + namesList);
		scanner.close();
	}

}
