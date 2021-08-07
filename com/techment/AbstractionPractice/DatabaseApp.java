package com.techment.AbstractionPractice;

public class DatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcConnection connection = new OracleDB();
		connection.connect();
	}

}
