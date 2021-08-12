package com.techment.LogicBuildingAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exercise43 {

	public static void main(String[] args) throws IOException{

//		Use split() method to break the 
//		sentence into words . Use Arrays.sort() to sort 
//		the array of strings and display in ascending 
//		order
//		Use BufferedReader to read a line from user. 
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		System.out.println("Enter the sentence : ");
		String sentence = bufferedReader.readLine();
		String[] words = sentence.split(" ");
		Arrays.sort(words);
		for(String str:words) {
			System.out.println(str);
		}
	}

}
