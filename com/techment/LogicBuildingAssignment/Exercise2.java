package com.techment.LogicBuildingAssignment;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Traffic Congestion- Even Odd rule
		
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date:");
		day = sc.nextInt();
		if(day>=1 && day<=31) {
			if(day%2==0) {
				System.out.println("Cars with Even registration numbers are permitted today");
			}
			else {
				System.out.println("Cars with Odd registration numbers are permitted today");
			}
		}
		else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
