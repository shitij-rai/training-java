package com.techment.CollectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;

class StudentMarks{
	int marks;

	public StudentMarks(int marks) {
		super();
		this.marks = marks;
	}
	
}

class MarksSort implements Comparator<StudentMarks>{
	@Override
	public int compare(StudentMarks o1, StudentMarks o2) {
		if(o1.marks == o2.marks)
			return 0;
		else if(o1.marks > o2.marks)
			return 1;
		else
			return -1;
	}
}

public class Question1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n = scanner.nextInt();	
		ArrayList<StudentMarks> marks = new ArrayList<StudentMarks>(n);
		for(int i=0;i<n;i++) {
			marks.add(new StudentMarks(scanner.nextInt()));
		}
		
		int marks3rdstudent = marks.get(2).marks;
		Collections.sort(marks, new MarksSort());
		
		System.out.println("Highest Marks : " + marks.get(n-1).marks );
		
		float totalMarks = 0;
		for(StudentMarks stu : marks) {
			totalMarks += stu.marks;
		}
		System.out.println("Average marks : " + (totalMarks/n));
		
		System.out.println("3rd Student Marks : " + marks3rdstudent);
		
		
		ListIterator<StudentMarks> itr = marks.listIterator();
		
		System.out.println("Sorted Marks : ");		
		while(itr.hasNext()) {
			System.out.print(itr.next().marks + " ");
		}
		scanner.close();
	}

}
