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
public class DeleteSinhVien {

    SinhVienConnection svc = new SinhVienConnection();
    Connection conn = svc.getConnection();
    PreparedStatement pst;
    final String sql = "DELETE FROM tblsinhvien WHERE id = ?";
    private Scanner sc;
    int id;

    public void deleteSV() {
        System.out.print("Nhập ID sinh viên cần xoá: ");
        sc = new Scanner(System.in);
        id = sc.nextInt();
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Xoá thành công!");
        } catch (SQLException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
