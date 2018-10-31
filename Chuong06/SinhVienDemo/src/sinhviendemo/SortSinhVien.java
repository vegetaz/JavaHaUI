/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhviendemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vegetaz
 */
public class SortSinhVien {
    SinhVienConnection svcon = new SinhVienConnection();
    PreparedStatement pst;
    Connection conn = svcon.getConnection();
    public void sortSV() {
        String sql = "SELECT * FROM tblsinhvien ORDER BY name"; //tăng dần
//        String sql = "SELECT * FROM tblsinhvien ORDER BY name DESC"; //giảm dần
        try {
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            System.out.println("Danh sách sinh viên sau khi sắp xếp");
            System.out.printf("%-12s%-18s%-6s%-25s%-18s\n", "ID", "Tên", "Tuổi", "Địa chỉ", "Điểm trung bình");
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                float gpa = rs.getFloat("gpa");
                System.out.printf("%-12s%-18s%-6s%-25s%-18s\n", id, name, age, address, gpa);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
