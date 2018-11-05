/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test0203;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vegetaz
 */
public class StudentConnection {

    Connection conn;
    private final String user = "root";
    private final String password = "25101989";
    private final String url = "jdbc:mysql://localhost:3306/vanvannguyen"
            + "?useSSL=false";
    private final String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getCon() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Có Lỗi Xảy Ra: " + e.getMessage());
        }
        return conn;
    }
}
