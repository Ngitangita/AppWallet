package com.app.wellet.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() {
        try {
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
