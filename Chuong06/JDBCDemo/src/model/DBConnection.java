/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
//download driver from website
// register library
//class for manager connection
public class DBConnection {

    Connection conn = null;
    String URL = "jdbc:sqlserver://localhost:51127;databaseName=demo";
    String sqlUsername = "sa";
    String sqlPassword = "25101989";

    public DBConnection() {
        try {
            //call driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //create connection
            conn = DriverManager.getConnection(URL, sqlUsername, sqlPassword);
            System.out.println("connected");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    public DBConnection(String url, String username, String pass) {
        try {
            //call driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //create connection
            conn = DriverManager.getConnection(url, username, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

    }

    public Connection getConnection() {
        return conn;
    }

    public static void main(String[] args) {
        new DBConnection();
    }

}
