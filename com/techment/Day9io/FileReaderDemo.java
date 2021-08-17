package com.techment.Day9io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\Shitij Rai\\eclipse-workspace\\LearningJava\\src\\com\\techment\\Day9io\\hello.txt");
		int ch = fr.read();
		while(ch != -1) {
			System.out.print((char) ch);	
			ch = fr.read();    // increment
		}
		fr.close();
	}
}
