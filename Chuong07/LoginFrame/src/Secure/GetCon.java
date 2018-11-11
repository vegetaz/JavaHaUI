/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vegetaz
 */
public class GetCon {

    Connection conn;
    private final String url = "jdbc:mysql://localhost:3306/demo";
    private final String user = "root";
    private final String password = "25101989";
    private final String driver = "com.mysql.jdbc.Driver";

    public Connection openC() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void closeC() {
        try {
            conn.close();
        } catch (SQLException e) {
        }
    }
}
