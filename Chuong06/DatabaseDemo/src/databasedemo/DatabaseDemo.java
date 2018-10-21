/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author PM_T7
 */
public class DatabaseDemo {

    private Connection con;
    final String uname = "root";
    final String upassword = "25101989";
    final String cs = "jdbc:mysql://localhost:3306/demo?useSSL=false";

    public DatabaseDemo() {
        try {
            //Nap driver
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(cs, uname, upassword);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void closeDatabase() {
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insert(String uname, String upassword, String uright) {
        String sql = "INSERT INTO tbluser (uname, upassword, uright) VALUES (?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, uname);
            pst.setString(2, upassword);
            pst.setString(3, uright);
            pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void update(int id, String uname, String upassword, String uright) {
        String sql = "UPDATE tbluser SET uname = ?, upassword = ?, uright = ? WHERE id = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, uname);
            pst.setString(2, upassword);
            pst.setString(3, uright);
            pst.setInt(4, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM tbluser WHERE id = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<User> getAllUser() {// hien thi
        String sql = "SELECT * FROM tbluser";
        ArrayList<User> u = new ArrayList();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String uname = rs.getString("uname");
                String upassword = rs.getString("upassword");
                String uright = rs.getString("uright");
                User ur = new User(id, uname, upassword, uright);
                u.add(ur);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return u;
    }

    public User login(String uname, String upassword) {
        User u = null;
        String sql = "SELECT * FROM tbluser WHERE uname = ? AND upassword = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, uname);
            pst.setString(2, upassword);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                u = new User(rs.getInt("id"), rs.getString("uname"), rs.getString("upassword"), rs.getString("uright"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return u;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseDemo ddm = new DatabaseDemo();
        ddm.insert("Van Van", "2510", "Admin");
        ddm.insert("Linh Linh", "6793", "User");
        ddm.insert("SSSS", "2510", "User");
        ddm.update(1, "Van", "2510", "Adm");
        ddm.delete(6);

        ArrayList<User> al = ddm.getAllUser();
        Iterator<User> ir = al.iterator();
        while (ir.hasNext()) {
            User u = ir.next();
            System.out.println(u);
        }
        User u = ddm.login("Van", "2510");
        if (u != null) {
            System.out.println(u);
        } else {
            System.out.println("Không tìm thấy!");
        }
        ddm.closeDatabase();
    }

}
