package com.techment.fundamentalsPractice;

class Employee{
	int id;
	String name;
	Address address;  // object reference
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void displayEmployee() {
		System.out.println("id : " + id);
		System.out.println("Name : " + name);
		System.out.println("DoorNo : " + address.doorNo);
		System.out.println("Street Name : " + address.streetName);
		System.out.println("City : " + address.city);
		System.out.println("PIN Code : " + address.pinCode);
	}
}

class Address{
	int doorNo;
	String streetName,city;
	int pinCode;
	
	public Address(int doorNo, String streetName, String city, int pinCode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
	}
	
}

public class HasARelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address addr = new Address(19, "BTM", "Bhilai", 490006);
		Employee emp = new Employee(55, "Raman", addr);
		emp.displayEmployee();
	}

}
