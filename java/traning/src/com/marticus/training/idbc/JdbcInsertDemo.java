package com.marticus.training.idbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * A sample program that demonstrates how to execute SQL INSERT statement
 * using JDBC. 
 * @author www.codejava.net
 *
 */

public class JdbcInsertDemo {

		public static void main(String[] args) {
			
			boolean flag=true;
			
			do {
				
		
				Scanner sc= new Scanner(System.in);		
				System.out.println("Please enter patient name:");
				String patient_name=sc.nextLine();			
				System.out.println("Please enter patient age:");
				int patient_age=sc.nextInt();
				Scanner sc1= new Scanner(System.in);
				System.out.println("Please enter patient gender:");
				String patient_gender=sc1.nextLine();				
				System.out.println("Please patient disease name:");
				String patient_disease_name=sc1.nextLine();
				insertData(patient_name, patient_age, patient_gender, patient_disease_name);
				System.out.println("Do you want to enter more data ? (Y/N)");	
				String input=sc1.nextLine();
				if(input.equalsIgnoreCase("N"))
				{
					flag=false;
				}
			}while(flag);
			System.out.println("Program ends");
		
		}
		
		public static void insertData(String patient_name,int patient_age,String patient_gender,String patient_disease_name)
		{
			
			String dbURL = "jdbc:mysql://localhost:3306/traning";
			String username = "root";
			String password = "@Chinnaraj2001#/";
			
			try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
				
				String sql = "INSERT INTO patient_data (patient_name, patient_age, patient_gender , patient_disease_name) VALUES (?, ?, ?, ?)";
				
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setString(1, patient_name);
				statement.setInt(2, patient_age);
				statement.setString(3, patient_gender);
				statement.setString(4, patient_disease_name);
				
				
				int rowsInserted = statement.executeUpdate();
				if (rowsInserted > 0) {
					System.out.println("A new user was inserted successfully!");
				}

				
			} catch (SQLException ex) {
				ex.printStackTrace();
			}		
		}

}
