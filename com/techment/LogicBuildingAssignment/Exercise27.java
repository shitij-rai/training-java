package com.techment.LogicBuildingAssignment;

import java.util.Random;

public class Exercise27 {

	public static void main(String[] args) {

//		Use Random class of Util Package to generate random numbers.
//		check if both the random numbers are even or not
//		Add the numbers if both are even or else subtract the values.
		
		Random random = new Random();
		
		int num1 = random.nextInt(6)+1;
		System.out.println("Dice Roll 1 : "+num1);
		
		int num2 = random.nextInt(6)+1;
		System.out.println("Dice Roll 2 : "+num2);
		
		if(num1%2 == 0 && num2%2==0)
			System.out.println("Sum : " + (num1+num2));
		else
			System.out.println("Difference : " + Math.abs(num2-num1));

	}

}
