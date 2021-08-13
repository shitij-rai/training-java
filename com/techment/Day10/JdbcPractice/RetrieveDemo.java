package com.techment.Day10.JdbcPractice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class RetrieveDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id to fetch resluts : ");
		int id = scanner.nextInt();
		try {
			Connection con = ConnectionDetails.getConnected();
			PreparedStatement ps = con.prepareStatement("select * from employee where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
			}
			scanner.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
