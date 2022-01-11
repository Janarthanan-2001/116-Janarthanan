package com.marticus.training.idbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String dbURL = "jdbc:mysql://localhost:3306/traning";
		String username = "root";
		String password = "@Chinnaraj2001#/";
		
		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
			
			String sql = "SELECT * FROM patient_data";
			
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			int count = 0;
			
			while (result.next()){
				String name = result.getString(2);
				String  disease_name= result.getString(5);
				String patient_name = result.getString("patient_name");
				String patient_disease_name = result.getString("patient_disease_name");
				
				String output = "patient_data #%d: %s - %s  ";
				
				System.out.println(String.format(output, ++count, patient_name, patient_disease_name, name, disease_name));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		

	}

}
