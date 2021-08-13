package com.techment.Day10.JdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDetails implements ConnectionProperties{

	public static Connection getConnected() throws Exception{
		Class.forName(DRIVER_NAME);
		Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		System.out.println("Connected...");
		return con;
	}
}
