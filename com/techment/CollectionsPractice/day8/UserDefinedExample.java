package com.techment.CollectionsPractice.day8;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	
	int id , age;
	String name , dept;
	public Employee(int id, int age, String name, String dept) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.dept = dept;
	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", dept=" + dept + "]";
//	}
	
	@Override
	public int compareTo(Employee o) {
		if(this.age == o.age)
			return 0;
		else if(this.age>o.age)
			return 1;
		else
			return -1;
	}
	
}

public class UserDefinedExample {

	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, 33, "Ramesh", "Sales"));
		employees.add(new Employee(2, 25, "Akash", "Operations"));
		employees.add(new Employee(3, 29, "Manoj", "Marketing"));
		employees.add(new Employee(4, 45, "Atul", "HR"));
		
		for(Employee emp : employees) {
			System.out.println("Employee [id=" + emp.id + ", age=" + emp.age + ", name=" + emp.name + ", dept=" + emp.dept + "]");
		}
		
		Collections.sort(employees);
		System.out.println("----- After Sorting -----");
		for(Employee emp : employees) {
			System.out.println("Employee [id=" + emp.id + ", age=" + emp.age + ", name=" + emp.name + ", dept=" + emp.dept + "]");
		}
//		System.out.println(employees);
	}

}
