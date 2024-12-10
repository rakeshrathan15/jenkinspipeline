package com.neoteric.jdbcconnection;

import java.sql.*;
import java.util.List;

public class DBConnetion {

    public  static List<Project> getAllocationEmployees(){

        String url = "jdbc:mysql://localhost:3307/sonar";
        String user = "root";
        String password = "sonar";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            String query = "select* from sonar.project p CROSS JOIN sonar.Employee e";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.println("Project Name : " + resultSet.getString(2)+
                        "  Employee Name:  " + resultSet.getString("name")+
                        "     Dept Name: " + resultSet.getString("dept")+
                        "    Salary: " + resultSet.getString("salary"));
            }

            resultSet.close();
            statement.close();


        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database.");
            e.printStackTrace();
        }
        return null;
    }
}
