package com.example.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	
	public static void main(String a[]) throws ClassNotFoundException{
        
        try {
           // Class.forName("org.postgresql.Driver"); //Java1.6 - Class.forName
            Connection con = DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","");
            Statement stmt = con.createStatement();
            System.out.println("Created DB Connection....");
            stmt.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
