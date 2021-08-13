package com.techment.Day10.JdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MySQLConnectionDemo {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Step-1 Load Driver Class
			System.out.println("Driver Class Loaded.");
			
			// Step-2 Create Connection
 			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false", "root", "shitijrai@1506mysql");
			System.out.println("Connected.");
			
			Statement stmt = con.createStatement();
//			stmt.execute("insert into employee values(2,'Suresh',35000);");
//			System.out.println("Inserted data into the table.");
			
			ResultSet rs = stmt.executeQuery("select * from employee"); // for retrieval of data
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) );
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
