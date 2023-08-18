package com.api.bigthree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class BigThreeApplication {
	public static void main(String[] args) {
		SpringApplication.run(BigThreeApplication.class, args);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://aws.connect.psdb.cloud/bigthree?sslMode=VERIFY_IDENTITY",
					"9fo46tlkzmwzqkoqvesg",
					"pscale_pw_turb6KRk6s2vPONl5oHbkBwKLFndylqnZCY8J2uW9Dm");
			System.out.println("Connected to Database");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
