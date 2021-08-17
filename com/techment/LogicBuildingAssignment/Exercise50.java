package com.techment.LogicBuildingAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise50 {

	public static void main(String[] args) {

//		What is Anagram ?
//				If two strings contain same set of characters but in different 
//				order then the two strings are called anagrams for example : 
//				“now” and “own” are anagrams.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first word : ");
		String word1 = scanner.next().toUpperCase();
		System.out.println("Enter second word : ");
		String word2 = scanner.next().toUpperCase();
		
		char[] arr1 = word1.toCharArray();
		char[] arr2 = word2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) 
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
		scanner.close();
	}

}
