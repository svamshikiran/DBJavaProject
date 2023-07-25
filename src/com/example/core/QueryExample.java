package com.example.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExample {
	
	public static void main(String a[]){
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","");
            Statement stmt = con.createStatement();
            System.out.println("Created DB Connection....");
            ResultSet rs = stmt.executeQuery("select * from student");
            while(rs.next()){
                System.out.println(rs.getInt("rollno"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("city"));
            }
            rs.close();
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
