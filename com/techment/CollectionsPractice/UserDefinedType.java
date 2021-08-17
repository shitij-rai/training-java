package com.techment.CollectionsPractice;

import java.util.ArrayList;

class Employee{
	
	int id;
	String name , dept;
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
}

public class UserDefinedType {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add( new Employee(11, "Bob", "HR"));
		employees.add( new Employee(12, "Mike", "Sales"));
		employees.add( new Employee(13, "Ron", "Operations"));
		
		for(Employee emp : employees) {
			System.out.println(emp.id + " " + emp.name + " " + emp.dept);
		}
		
	}

}
