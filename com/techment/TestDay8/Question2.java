package com.techment.TestDay8;

class Employee{
	String firstName , lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName = " + firstName + ", lastName = " + lastName + "]";
	}
	
}

public class Question2 {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Mahesh", "Kumar");
		Employee emp2 = new Employee("Rajesh", "Arya");
		Employee emp3 = new Employee("Punit", "Roy");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
	}

}
