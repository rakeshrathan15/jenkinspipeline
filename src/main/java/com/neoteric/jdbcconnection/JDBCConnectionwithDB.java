package com.neoteric.jdbcconnection;
import java.sql.*;


public class JDBCConnectionwithDB {
    public static void main(String[] args) {

        String sql ="select  name from sonar.Employee ";
        String jdbcURL = "jdbc:mysql://localhost:3307/sonar";
        String username = "root";
        String password = "sonar";

        try {
            // Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");



            // Establish connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to the database successfully!");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);

            resultSet.next();

            String name= resultSet.getString(1);
            System.out.println(name);



            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
        }
    }
}
