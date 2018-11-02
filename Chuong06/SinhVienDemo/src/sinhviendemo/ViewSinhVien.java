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
import java.util.ArrayList;

/**
 *
 * @author Vegetaz
 */
public class ViewSinhVien {

    SinhVienConnection svcon = new SinhVienConnection();
    Connection conn = svcon.getConnection();
    final String sql = "SELECT * FROM tblsinhvien";
    PreparedStatement pst;
    ResultSet rs;
    
    public ArrayList<SinhVien> getAllSinhVien() {
        ArrayList<SinhVien> asv = new ArrayList();
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                SinhVien sv = new SinhVien();
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                int age = rs.getInt("age");
//                String address = rs.getString("address");
//                float gpa = rs.getFloat("gpa");
                sv.setId(rs.getInt("id"));
                sv.setName(rs.getString("name"));
                sv.setAge(rs.getInt("age"));
                sv.setAddress(rs.getString("address"));
                sv.setGpa(rs.getFloat("gpa"));
                asv.add(sv);
//                System.out.printf("%-12s%-18s%-6s%-25s%-18s\n", id, name, age, address, gpa);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
        return asv;
    }
    
    public void viewSinhVien() {
        getAllSinhVien();
        System.out.println("Danh sách sinh viên");
        System.out.printf("%-12s%-18s%-6s%-25s%-18s\n", "ID", "Tên", "Tuổi", "Địa chỉ", "Điểm trung bình");
//        for (SinhVien svi : getAllSinhVien()) {
//            System.out.println(svi);
//        }
        getAllSinhVien().forEach((svi) -> {
            System.out.println(svi);
        });
    }
}
