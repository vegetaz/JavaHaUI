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
public class UpdateSinhVien {
    SinhVienConnection sconn = new SinhVienConnection();
    Connection conn = sconn.getConnection();
    PreparedStatement pst;
    String sql = "UPDATE tblsinhvien SET name = ?, age = ?, address = ?, gpa = ? WHERE id = ?";
    String name;
    int age;
    String address;
    float gpa;
    int id;
    static Scanner sc;
        
    public void update() {
        sc = new Scanner(System.in);
        try {
            pst = conn.prepareStatement(sql);
            System.out.println("Cập nhật thông tin sinh viên");
            System.out.print("ID cần cập nhật: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Tên cập nhật: ");
            name = sc.nextLine();
            System.out.print("Tuổi cập nhật: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.print("Địa chỉ cập nhật: ");
            address = sc.nextLine();
            System.out.print("Điểm trung bình cập nhật: ");
            gpa = sc.nextFloat();
            pst.setString(1, name);
            pst.setInt(2, age);
            pst.setString(3, address);
            pst.setFloat(4, gpa);
            pst.setInt(5, id);
            pst.executeUpdate();
            System.out.println("Cập nhật thành công!");
        } catch (SQLException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
