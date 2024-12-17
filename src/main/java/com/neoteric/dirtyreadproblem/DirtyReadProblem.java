package com.neoteric.dirtyreadproblem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DirtyReadProblem {

    public static void main(String[] args) {
    try
    {

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection1= DriverManager.getConnection("jdbc:mysql://localhost:3307/sonarlatest","root","sonar");
        connection1.setAutoCommit(false);
    // connection1.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
        connection1.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);

//    Connection  connection2= DriverManager.getConnection("jdbc:mysql://localhost:3307/sonarlatest","root","sonar");
//    connection2.setAutoCommit(false);
//  //  connection2.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
//        connection2.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);

        PreparedStatement preparedStatement1= connection1.prepareStatement("update account set balance=? where id=?");
        preparedStatement1.setDouble(1,15000);
        preparedStatement1.setInt(2,1);
        preparedStatement1.executeUpdate();

        System.out.println("T1: Updated balance to 500.00 but not committed.");

        Thread.sleep(10000);

        PreparedStatement preparedStatement2= connection1.prepareStatement("select balance from account where id=?");
        preparedStatement2.setInt(1, 1);
       ResultSet resultSet= preparedStatement2.executeQuery();

        if(resultSet.next()){
            System.out.println("T2: Read balance: " + resultSet.getDouble("balance"));
        }
        connection1.commit();

        System.out.println("T1: commited back the transaction.");

        connection1.rollback();

        System.out.println("T1: Rolled back the transaction.");

        // Close resources
        resultSet.close();
        preparedStatement1.close();
        preparedStatement2.close();
        connection1.close();
       // connection2.close();



    }catch (Exception exception){
        System.out.println("exception is occured");
        exception.printStackTrace();
    }

    }
}
