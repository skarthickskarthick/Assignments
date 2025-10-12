
package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/userapp";
    private static final String USER = "root";
    private static final String PASS = "9488";

    public static Connection getConnection() throws SQLException {
        System.out.println("db connected");


        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // required for MySQL 8+
            return DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Driver not found");
        }
    }
}

