package com.techment.CollectionAssignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Question5 {

	public static void main(String[] args) throws FileNotFoundException , IOException{

		FileReader fileReader = new FileReader("C:\\Users\\Shitij Rai\\eclipse-workspace\\LearningJava\\src\\com\\techment\\CollectionAssignment\\states.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		LinkedHashSet<String> stateSet = new LinkedHashSet<String>();
		String line = bufferedReader.readLine();
		while(line != null) {
			stateSet.add(line);
			line = bufferedReader.readLine();
		}
		System.out.println(stateSet);
		System.out.println("Total States : " + stateSet.size());
		System.out.println("Removing Delhi from the set : ");
		stateSet.remove("Delhi");
		System.out.println(stateSet);
		
		System.out.println("States starting with K : ");
		for(String states : stateSet) {
			if(states.startsWith("K"))
				System.out.print(states + " ");
		}
		
		TreeSet<String> stateTreeSet = new TreeSet<String>(stateSet);
		System.out.println("\n" + "States in Sorted Order : ");
		System.out.println(stateTreeSet);
		bufferedReader.close();
	}

}
