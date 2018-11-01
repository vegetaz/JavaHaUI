/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vegetaz
 */
public class StudentDAO {

    public static Connection getCon() {
        Connection conn = null;
        final String url = "jdbc:mysql://localhost:3306/demo";
        final String user = "root";
        final String password = "25101989";
        final String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return conn;
    }
}
