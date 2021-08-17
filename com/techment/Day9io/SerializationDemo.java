package com.techment.Day9io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	String name; // use transient for not serializing this variable
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

public class SerializationDemo {

	public static void main(String[] args) throws IOException{

		Employee emp1 = new Employee(10, "Rohan");
		System.out.println("------- Serialization started ---------");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Shitij Rai\\eclipse-workspace\\LearningJava\\src\\com\\techment\\Day9io\\employees.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		System.out.println("------- Serialization Done ---------");
	}

}
