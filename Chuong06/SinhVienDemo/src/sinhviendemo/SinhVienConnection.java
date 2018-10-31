/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhviendemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vegetaz
 */
public class SinhVienConnection {

    Connection conn;
    final String url = "jdbc:mysql://localhost:3306/demo?useSSL=false&useUnicode=true&characterEncoding=UTF-8";
    final String user = "root";
    final String password = "25101989";
    final String driver = "com.mysql.jdbc.Driver";

    public Connection getConnection() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
        return conn;
    }
}
