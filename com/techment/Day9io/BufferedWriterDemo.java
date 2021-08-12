package com.techment.Day9io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException{

		FileWriter fw = new FileWriter("C:\\Users\\Shitij Rai\\eclipse-workspace\\LearningJava\\src\\com\\techment\\Day9io\\sample.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fw);
		bufferedWriter.write("This is sample file");
		bufferedWriter.newLine();
		bufferedWriter.write("This is the data of sample file.");
		bufferedWriter.close();
	}

}
