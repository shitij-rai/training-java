package com.techment.AbstractionPractice;

public class OracleDB implements JdbcConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to To Oracle");
	}

}
