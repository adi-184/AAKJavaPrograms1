/*

CREATE DATABASE my_database;

 */

 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;
 
 public class DatabaseConnection {
 
     private static final String URL = "jdbc:mysql://localhost:3306/my_database";  
     private static final String USER = "new_user";  
     private static final String PASSWORD = "system";  
 
     public static void main(String[] args) {
         try {
             Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             System.out.println("Connected to the database successfully!");
             con.close();
         } catch (SQLException e) {
             System.out.println("Failed to connect to the database.");
             e.printStackTrace();
         }
     }
 }
 
/*
OUTPUT

Connected to the database successfully!

 */