/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sachdatabasedemo;

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
 * @author Vegetaz
 */
public class SachDatabaseDemo {

    private Connection con;
    final String username = "root";
    final String password = "25101989";
    final String jdbcdriver = "com.mysql.jdbc.Driver";
    final String cs = "jdbc:mysql://localhost:3306/demo?useSSL=false";

    public SachDatabaseDemo() { //Tạo kết nối đến MySQL
        try {
            Class.forName(jdbcdriver);
            con = DriverManager.getConnection(cs, username, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
/*     public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(cs, username, password);
    } */

    public void closeConnection() { //Đóng kết nối!
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertSach(String namesach, float pricesach, String theloaisach) {
        String sql = "INSERT INTO tblsach (namesach, pricesach, theloaisach) VALUES (?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, namesach);
            pst.setFloat(2, pricesach);
            pst.setString(3, theloaisach);
            pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateSach(int idsach, String namesach, float pricesach, String theloaisach) {
        String sql = "UPDATE tblsach SET namesach = ?, pricesach = ?, theloaisach = ? WHERE idsach = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idsach);
            pst.setString(2, namesach);
            pst.setFloat(3, pricesach);
            pst.setString(3, theloaisach);
            pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteSach(int id) {
        String sql = "DELETE FROM tblsach WHERE id = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Sach> getAllSach() {
        String sql = "SELECT * FROM tblsach";
        ArrayList<Sach> sach = new ArrayList();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int idsach = rs.getInt("idsach");
                String uname = rs.getString("namesach");
                Float pricesach = rs.getFloat("pricesach");
                String theloaisach = rs.getString("theloaisach");
                Sach sch = new Sach(idsach, uname, pricesach, theloaisach);
                sach.add(sch);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sach;
    }

    public Sach timSach(String namesach) {
        Sach sach = null;
        String sql = "SELECT * FROM tblsach WHERE namesach = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, namesach);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                sach = new Sach(rs.getInt("idsach"),
                        rs.getString("namesach"),
                        rs.getFloat("pricesach"),
                        rs.getString("theloaisach"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sach;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SachDatabaseDemo sdm = new SachDatabaseDemo();
        sdm.insertSach("Sach 1", 150000, "Khoa Hoc");
        sdm.insertSach("Sach 2", 150000, "Lich Su");
        sdm.insertSach("Sach 3", 150000, "Ngon Tinh");
        ArrayList<Sach> sachlist = sdm.getAllSach();
        Iterator<Sach> ir = sachlist.iterator();
        while (ir.hasNext()) {
            Sach s = ir.next();
            System.out.println(s);
        }
    }

}
