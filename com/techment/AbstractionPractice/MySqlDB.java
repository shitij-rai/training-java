package com.techment.AbstractionPractice;

public class MySqlDB implements JdbcConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to To MySQL");
	}

}
