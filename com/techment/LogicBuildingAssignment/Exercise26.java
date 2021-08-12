package com.techment.LogicBuildingAssignment;

import java.util.Random;
import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a random no. between 1 to 9");
		int num = scanner.nextInt();
		
		Random random = new Random();
		int random_num = random.nextInt(9)+1;
		System.out.println("Random Number Generated : " + random_num);
		
		if(num == random_num)
			System.out.println("The random numbers were same.");
		else
			System.out.println("The random numbers were different.");
		scanner.close();
	}

}
