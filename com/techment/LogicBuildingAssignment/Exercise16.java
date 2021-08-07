package com.techment.LogicBuildingAssignment;
import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		//  Divisible by 8 and 3
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scanner.nextInt();
		
		if(num%8==0 && num%3==0)
			System.out.println("Yes , the number is divisible by 8 and 3.");
		else
			System.out.println("No , the number is not divisible by 8 and 3.");
		scanner.close();
	}

}
