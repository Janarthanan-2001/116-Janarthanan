package com.marticus.training.idbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbUpdateDeme {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/traning";
		String username = "root";
		String password = "@Chinnaraj2001#/";

		try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {

			String sql = "UPDATE patient_data SET  patient_age=?, patient_gender=?, patient_disease_name=? WHERE patient_name=?";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, 25);
			statement.setString(2, "Male");
			statement.setString(3, "fever");
			statement.setString(4, "jana");

			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing user was updated successfully!");
			}


		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	

}
