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
import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class SearchSinhVienT {

    SinhVienConnection svcon = new SinhVienConnection();
    Connection conn = svcon.getConnection();
    PreparedStatement pst;
    String ss;
    String sql = "SELECT * FROM tblsinhvien WHERE name LIKE '%";
    Scanner sc;

    public void searchT() {
        sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên cần tìm: ");
        ss = sc.nextLine();
        try {
            pst = conn.prepareStatement(sql + ss + "%'");
            ResultSet rs = pst.executeQuery();
            System.out.println("Danh sách sinh viên tìm được");
            System.out.printf("%-12s%-18s%-6s%-25s%-18s\n", "ID", "Tên", "Tuổi", "Địa chỉ", "Điểm trung bình");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                float gpa = rs.getFloat("gpa");
                System.out.printf("%-12s%-18s%-6s%-25s%-18s\n", id, name, age, address, gpa);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }
}
