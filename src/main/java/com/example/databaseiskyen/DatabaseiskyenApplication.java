package com.example.databaseiskyen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class DatabaseiskyenApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseiskyenApplication.class, args);
		String url = "jdbc:mysql://52.138.137.228:3306/mysql";
		String username = "root";
		String password = "mypassword";

		System.out.println("Connecting database...");

		try (
				Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println("Database connected!");
		} catch (
				SQLException e) {
			throw new IllegalStateException("Cannot connect the database!", e);
		}
	}

}
