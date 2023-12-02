package com.app.wellet.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() {
        try {
            System.out.println(System.getenv("URL")+" "+ System.getenv("USERNAME") +" "+ System.getenv("PASSWORD"));
            return DriverManager.getConnection(
                    System.getenv("URL"),
                    System.getenv("USERNAME"),
                    System.getenv("PASSWORD")
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
