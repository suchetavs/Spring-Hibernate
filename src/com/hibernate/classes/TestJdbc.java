package com.hibernate.classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl="jdbc:mysql://localhost:3306/hibernateproject?useSSL=false";
		String user="hbstudent";
		String password="hbstudent";
		
		
		try {
			
			Connection myconn=DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println(myconn);
			//myconn.
			
			
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
