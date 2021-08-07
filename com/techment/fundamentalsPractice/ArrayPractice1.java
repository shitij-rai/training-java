package com.techment.fundamentalsPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many Marks you want to enter:");
		int n = scanner.nextInt();
		int marks[] = new int[n];
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter Marks " + (i+1) + " : ");
			marks[i] = scanner.nextInt();
		}
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("Marks " + (i+1) + " : " + marks[i]);
		}
		
		int lowest,highest,second_highest;
		
		highest = marks[0];
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>highest)
				highest = marks[i];
		}
		System.out.println("Highest Marks is " + highest);
		
		lowest = marks[0];
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<lowest)
				lowest = marks[i];
		}
		System.out.println("Lowest Marks is " + lowest);
		
		Arrays.sort(marks);
		second_highest = marks[n-2];
		System.out.println("Second Highest Marks is " + second_highest);
		
		if(lowest>40)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		scanner.close();
	}

}
