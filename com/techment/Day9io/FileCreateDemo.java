package com.techment.Day9io;

import java.io.File;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException{

		
		File file = new File("C:\\Users\\Shitij Rai\\eclipse-workspace\\LearningJava\\src\\com\\techment\\Day9io\\hello.txt");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());		
	}

}
