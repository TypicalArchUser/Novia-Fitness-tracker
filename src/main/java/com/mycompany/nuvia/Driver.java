package com.mycompany.nuvia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Bre4d
 */
public class Driver {

    public static void main(String[] args) throws Exception {
        try {
            String Driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql//localhost:3306/test";
            String username = "root";
            String password = "";

            Class.forName(Driver);
            
           Connection con = DriverManager.getConnection(url,username,password);
           
           
           System.out.println("connected");
            
        }catch(ClassNotFoundException | SQLException e)  {
        } 
        return con;
        
    }

}
