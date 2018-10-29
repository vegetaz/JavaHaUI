/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Vegetaz
 */
public class StudentDao {
    Connection conn;
    private final String user = "root";
    private final String password = "25101989";
    private final String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    public void openConn() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public void closeConn() {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public ArrayList<Student> getAllStudent() {
        String sql = "SELECT * FROM tblsinhvien";
        ArrayList<Student> student = new ArrayList();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                float gpa = rs.getFloat("gpa");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
