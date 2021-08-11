package com.techment.CollectionsPractice.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

class Student{
	int id , age;
	String name ;
	
	public Student(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}
	
}

class AgeSorting implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.age == o2.age)
			return 0;
		else if(o1.age > o2.age)
			return 1;
		else 
			return -1;
	}
}

class NameSorting implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(15, 19, "Anuj"));
		studentList.add(new Student(13, 18, "Chetan"));
		studentList.add(new Student(16, 20, "Bhaskar"));
		studentList.add(new Student(10, 22, "Ram"));
		
		for(Student stu : studentList) {
			System.out.println("Student [id=" + stu.id + ", age=" + stu.age + ", name=" + stu.name + "]");
		}
		
		Collections.sort(studentList,new NameSorting());
		
		System.out.println("---- Sorting by Name ----");
		for(Student stu : studentList) {
			System.out.println("Student [id=" + stu.id + ", age=" + stu.age + ", name=" + stu.name + "]");
		}
		
		Collections.sort(studentList,new AgeSorting());
		System.out.println("---- Sorting by Age ----");
		for(Student stu : studentList) {
			System.out.println("Student [id=" + stu.id + ", age=" + stu.age + ", name=" + stu.name + "]");
		}
	}

}
