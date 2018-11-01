/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Vegetaz
 */
public class StudentManager {

    static Scanner sc;
    static Connection conn = StudentDAO.getCon();
    PreparedStatement pst;

    public ArrayList<Student> view() {
        final String sql = "SELECT * FROM sinhvien";
        ArrayList<Student> als = new ArrayList<Student>();
        try {
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            System.out.printf("%-5s%-25s%-25s\n", "ID", "Tên", "Mã sinh viên");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int msv = rs.getInt("msv");
                System.out.printf("%-5s%-25s%-25s\n", id, name, msv);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        return als;
    }

    public void Inserts() {

        final String sql = "INSERT INTO sinhvien(name, msv) VALUES(?, ?)";
        String name;
        int msv;

        sc = new Scanner(System.in);
        System.out.println("Nhập thông tin");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Ma SV: ");
        msv = sc.nextInt();

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setInt(2, msv);
            pst.executeUpdate();
            System.out.println("Success");
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void search() {
        int id;
        String sql = "SELECT * FROM sinhvien WHERE id = ";
        try {
            System.out.print("ID cần tìm: ");
            sc = new Scanner(System.in);
            id = sc.nextInt();
            pst = conn.prepareStatement(sql + id);
            ResultSet rs = pst.executeQuery();
            System.out.println("Danh sách sinh viên tìm được");
            System.out.printf("%-5s%-25s%-25s\n", "ID", "Tên", "Mã sinh viên");
            while (rs.next()) {
                id = rs.getInt("id");
                String name = rs.getString("name");
                int msv = rs.getInt("msv");
                System.out.printf("%-5s%-25s%-25s\n", id, name, msv);
            }
        } catch (SQLException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }

    public void sortSV() {
        String sql = "SELECT * FROM sinhvien ORDER BY name DESC";
        //Sắp xếp theo thứ tự giảm dần của name
        try {
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            System.out.printf("%-5s%-25s%-25s\n", "ID", "Tên", "Mã sinh viên");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int msv = rs.getInt("msv");
                System.out.printf("%-5s%-25s%-25s\n", id, name, msv);
            }
        } catch (SQLException e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }

    public void delete() {
        final String sql = "DELETE FROM sinhvien WHERE id = ?";
        int id;
        sc = new Scanner(System.in);
        PreparedStatement pst;
        System.out.print("Nhập id cần xoá: ");
        id = sc.nextInt();
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Xoá thành công!");
            pst.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }
}
