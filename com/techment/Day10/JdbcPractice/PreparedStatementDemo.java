package com.techment.Day10.JdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Step-1 Load Driver Class
			System.out.println("Driver Class Loaded.");
			
			// Step-2 Create Connection
 			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false", "root", "shitijrai@1506mysql");
			System.out.println("Connected.");
			
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter no. of Employees : ");
			int num = scanner.nextInt();
			for(int i=0;i<num;i++) {
				System.out.println("Enter id , name , salary of Employee " + (i+1) + " :");
				System.out.println("Enter id : ");
				int eid = scanner.nextInt();
				ps.setInt(1, eid);
				System.out.println("Enter Name : ");
				String eName = scanner.nextLine();
				eName += scanner.nextLine();
				ps.setString(2, eName);
				System.out.println("Enter Salary : ");
				int eSalary = scanner.nextInt();
				ps.setInt(3, eSalary);
				ps.execute();
			}
			
			System.out.println("Inserted details of " + num + " Employees.");
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
