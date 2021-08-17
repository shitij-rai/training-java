package com.techment.TestDay8;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of People whose ages you want to enter");
		int n = scanner.nextInt();
		System.out.println("Enter the ages of" + n + " people : ");
		int[] age_arr = new int[n];
		for(int i=0;i<n;i++) {
			age_arr[i] = scanner.nextInt();		
		}
		
		int children = 0; 
		int adults = 0; 
		int seniorCitizens = 0;
		
		for(int i=0;i<n;i++) {
			if(age_arr[i]<18)
				children += 1;
			else if(age_arr[i]>=18 && age_arr[i]<55)
				adults += 1;
			else if(age_arr[i]>=55)
				seniorCitizens += 1;
		}
		
		System.out.println("Children : " + children);
		System.out.println("Adults : " + adults);
		System.out.println("Senior Citizens : " + seniorCitizens);
		scanner.close();
	}

}
