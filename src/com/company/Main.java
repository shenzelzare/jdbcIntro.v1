package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try{
            System.out.println("Baglanti Olustu");
        } finally{
            connection.close();
        }
    }
}
