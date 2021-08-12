package com.techment.CollectionAssignment;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;


class AnalyzeScore implements Comparator<HashMap.Entry<String, Integer>>{
	
	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		return o1.getKey().compareTo(o2.getKey());
	}
}

public class Question3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of Batsmen : ");
		int numOfbatsmen = scanner.nextInt();
		System.out.println("Enter the names and runs of the Batsmen : ");
		
		HashMap<String, Integer> runsMap = new HashMap<String, Integer>();
		for(int i=0;i<numOfbatsmen;i++) {
			runsMap.put(scanner.next(), scanner.nextInt());
		}
		
		LinkedList<Entry<String, Integer>> runsList = new LinkedList<Entry<String, Integer>>(runsMap.entrySet());
		Collections.sort(runsList, new AnalyzeScore());
		
		System.out.println("Players who batted : ");
		scanner.close();
		
	}

}
