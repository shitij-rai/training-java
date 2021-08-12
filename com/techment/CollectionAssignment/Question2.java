package com.techment.CollectionAssignment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class ScoreAnalyzer{
	private LinkedList<Integer> runsData;

	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	}
	
	public void addRunsToList(int run) {
		runsData.add(run);
	}
	
	public float calcRunRate() {
		int totalRuns = 0;
		for(Integer run : runsData) {
			totalRuns += run;
		}
		return (float)totalRuns/50;
	}
	
	public int lowestRunsScored() {
		Collections.sort(runsData);
		return runsData.get(0);
	}
	
	public void displayRuns() {
		for(int i=0;i<runsData.size();i++) {
			System.out.print("Player " + (i+1) + " runs = " + runsData.get(i) + "\n");
		}
	}
}

public class Question2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> runsData = new LinkedList<>();
		ScoreAnalyzer analyzer = new ScoreAnalyzer(runsData);
		
		System.out.println("Enter runs (Enter any character to END) : ");
		while(true) {
			analyzer.addRunsToList(scanner.nextInt());
			if(!scanner.hasNextInt())
				break;
		}
		
		System.out.println(runsData);
		analyzer.displayRuns();
		System.out.println("Runrate = " + analyzer.calcRunRate());
		System.out.println("Lowest runs scored = " + analyzer.lowestRunsScored());
		System.out.println("No. of players who batted = " + runsData.size());
		
		scanner.close();
	}

}
