package com.techment.Day9io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException , ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Shitij Rai\\eclipse-workspace\\LearningJava\\src\\com\\techment\\Day9io\\employees.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = (Employee) ois.readObject();
		System.out.println("id : " + e.id);
		System.out.println("name : " +e.name);
	}

}
