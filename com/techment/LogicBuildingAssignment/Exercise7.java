package com.techment.LogicBuildingAssignment;
import java.util.Scanner;
public class Exercise7 {

	public static void main(String[] args) {
		// Who are going for Battle
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First number that the King calls:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the Second number that the King calls:");
		int num2 = scanner.nextInt();
		
		System.out.println("The numbers of soldiers who are going to War are:");
		for(int i=num1;i<=num2;i++) {
			System.out.println(i);
		}
		scanner.close();
	}

}
