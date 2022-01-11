package com.marticus.training.idbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag=true;
		do
		{
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
			System.out.println("Please enter patient name:");
			String patient_name=sc.nextLine();
			delectData(patient_name);
			System.out.println("Do you want to enter more data ? (Y/N)");	
			String input=sc.nextLine();
			if(input.equalsIgnoreCase("N"))
			{
				flag=false;
			}
		}while(flag);
		System.out.println("Program ends");
	}
		public static void delectData(String patient_name)
		{
			String dbURL = "jdbc:mysql://localhost:3306/traning";
			String username = "root";
			String password = "@Chinnaraj2001#/";
			
			try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
				
				String sql = "DELETE FROM patient_data WHERE patient_name=?";
				
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setString(1, patient_name);
				
				int rowsDeleted = statement.executeUpdate();
				if (rowsDeleted > 0) {
					System.out.println("A user was deleted successfully!");
				}
				
			} catch (SQLException ex) {
				ex.printStackTrace();
			}		
	
	}

}
