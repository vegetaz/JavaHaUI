/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhviendemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class InsertSinhVien {
    SinhVienConnection svcon = new SinhVienConnection();
    Connection conn = svcon.getConnection();
    
    PreparedStatement pst;
    String sql = "INSERT INTO tblsinhvien (name, age, address, gpa) VALUES (?, ?, ?, ?)";
    
    Scanner sc = new Scanner(System.in);
    public void insertSV() {
        System.out.println("Nhập thông tin sinh viên cần thêm");
        System.out.print("Tên: ");
        String name = sc.nextLine();
        System.out.print("Tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Địa chỉ: ");
        String address = sc.nextLine();
        System.out.print("Điểm trung bình: ");
        float gpa = sc.nextFloat();
        sc.nextLine();
        System.out.println("Thêm thành công!");
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setInt(2, age);
            pst.setString(3, address);
            pst.setFloat(4, gpa);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }
}
