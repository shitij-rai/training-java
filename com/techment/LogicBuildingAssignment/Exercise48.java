package com.techment.LogicBuildingAssignment;

import java.util.Scanner;

public class Exercise48 {

	public static void main(String[] args) {

//		Accept the Binary number into an integer variable. Using 
//		num%10 extract the digits from right to left . Use a while loop for 
//		the same. Find the power of each digit using Math. Pow() and find 
//		the sum of the powers which results in the decimal equivalent.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Binary Number :");
		int binaryNum = scanner.nextInt();
		int r;
		int decimalNum=0;
		int i=0;
		while(binaryNum>0) {
			
			r = binaryNum%10;
			decimalNum += r*Math.pow(2, i);
			binaryNum /= 10;
			i++;
		}
		System.out.println("Decimal Number = " + decimalNum);
		scanner.close();
	}

}
