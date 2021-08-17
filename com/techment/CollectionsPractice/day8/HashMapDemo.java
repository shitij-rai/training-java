package com.techment.CollectionsPractice.day8;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		Student student1 = new Student(1, 21, "Ajay");
		Student student2 = new Student(1, 21, "Ajay");
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
		HashMap<Student, String> stuHM = new HashMap<Student, String>();
		stuHM.put(student1, "CSE");
		stuHM.put(student2, "CSE");
		
		for(Entry<Student, String> stu : stuHM.entrySet()) {
			System.out.println(stu);
		}
	}

}
