package com.techment.LogicBuildingAssignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

class Question{
	String question , option1 , option2 , option3 , option4 , correctAnswer;

	public Question(String question, String option1, String option2, String option3, String option4,
			String correctAnswer) {
		super();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctAnswer = correctAnswer;
	}
	
}

public class Exercise24 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Question q1 = new Question("What is the capital of India?", "Maharashtra", "Chennai", "Delhi", "Rajasthan", "Delhi");
		Question q2 = new Question("What is the capital of Chhattisgarh?", "Durg", "Raipur", "Bilaspur", "Korba", "Raipur");
		Question q3 = new Question("Which of these is not a Planet?", "Neptune", "Earth", "Saturn", "Sun", "Sun");
		
		HashMap<Integer, Question> queMap = new HashMap<Integer, Question>();
		queMap.put(1, q1);
		queMap.put(2, q2);
		queMap.put(3, q3);
		
		System.out.println("Enter the question No. :");
		int q_id = scanner.nextInt();
		
		for(Entry<Integer,Question> entries : queMap.entrySet()) {
			if(q_id == entries.getKey()) {
				System.out.println(entries.getValue().question);
				System.out.println("1. " +entries.getValue().option1);
				System.out.println("2. " +entries.getValue().option2);
				System.out.println("3. " +entries.getValue().option3);
				System.out.println("4. " +entries.getValue().option4);
				
				System.out.println("Enter your Answer :");
				String ans = scanner.next();
				
				if(ans == entries.getValue().correctAnswer) {
					System.out.println("Correct Answer");
					break;
				}	
			}
			else
				continue;
		}
		
		
	}

}
