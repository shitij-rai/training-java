package com.techment.CollectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.TreeSet;

class Patient implements Comparable<Patient>{
	
	private int id;
	private String name;
	private int age;
	
	public Patient(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Patient o) {
		return this.name.compareTo(o.name);
	}

	static int getPatientAge(String name , TreeSet<Patient> paitentTreeSet) {
		for(Patient patients : paitentTreeSet) {
			if(patients.name == name)
				return patients.age;
		}
		return 0;
	}
}

class AgeSort implements Comparator<Patient>{
	@Override
	public int compare(Patient o1, Patient o2) {
		if(o1.getAge() == o2.getAge())
			return 0;
		else if(o1.getAge() > o2.getAge())
			return 1;
		else
			return -1;
	}
}

public class Question4 {

	public static void main(String[] args) {

		ArrayList<Patient> patientList = new ArrayList<Patient>();
		patientList.add(new Patient(10, "Mike", 28));
		patientList.add(new Patient(11, "Bob", 25));
		patientList.add(new Patient(12, "John", 33));
		
		Collections.sort(patientList);
		
		System.out.println("Sorting Name : ");
		for(Patient patients : patientList) {
			System.out.println("Id = "+patients.getId() + " Name = " + patients.getName() + " Age = " + patients.getAge());
		}
		
		Collections.sort(patientList, new AgeSort());
		
		ListIterator<Patient> itr = patientList.listIterator();
		
		System.out.println("Sorting Age : ");
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}

		TreeSet<Patient> patientTreeSet	= new TreeSet<Patient>();
		patientTreeSet.add(new Patient(10, "Mike", 28));
		patientTreeSet.add(new Patient(11, "Bob", 25));
		patientTreeSet.add(new Patient(12, "John", 33));
		
		System.out.println("Pattent TreeSet : ");
		System.out.println(patientTreeSet);
		
		System.out.println("Age : " + Patient.getPatientAge("John", patientTreeSet));
	}

}
