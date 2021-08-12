package com.techment.Day9io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException{

		FileReader fileReader = new FileReader("C:\\Users\\Shitij Rai\\eclipse-workspace\\LearningJava\\src\\com\\techment\\Day9io\\sample.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		while(line != null) {
			System.out.println(line);
			line = bufferedReader.readLine(); //increment line
		}
		bufferedReader.close();
	}

}
