package com.techment.Day9io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException{

		
		FileWriter fw = new FileWriter("C:\\Users\\Shitij Rai\\eclipse-workspace\\LearningJava\\src\\com\\techment\\Day9io\\hello.txt");
		fw.write("Hello This is the data written in hello.txt");
		System.out.println("Written Successfully.");
		fw.close();
	}

}
