/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test0203;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vegetaz
 */
public class StudentManager {

    StudentConnection scon = new StudentConnection();
    Connection conn = scon.getCon();
    Scanner sc = new Scanner(System.in);
    PreparedStatement pst;
    ResultSet rs;
    Iterator ir;
    String sql;

    public ArrayList<Student> getAllStudent() {
        ArrayList<Student> als = new ArrayList();
        sql = "SELECT * FROM tblstudent";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setCode(rs.getString("code"));
                s.setName(rs.getString("name"));
                s.setDob(rs.getString("dob"));
                s.setGender(rs.getString("gender"));
                s.setPob(rs.getString("pob"));
                s.setAvgmark(rs.getFloat("avgmark"));
                als.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return als;
    }

    public void view() {
        ir = getAllStudent().iterator();
        System.out.println("Danh sách sinh viên");
        System.out.printf("%-12s%-15s%-22s%-12s%-11s%-22s%-16s\n", "ID",
                "Mã sinh viên", "Họ tên", "Ngày sinh", "Giới tính", "Quê quán",
                "Điểm trung bình");
        while (ir.hasNext()) {
            Student st = (Student) ir.next();
            System.out.println(st);
        }
    }

    public void insertSV() {
        sql = "INSERT INTO tblstudent(code, name, dob, gender, pob, avgmark) "
                + "VALUES(?, ?, ?, ?, ?, ?)";
        System.out.println("Nhập thông tin sinh viên");
        System.out.print("Mã sinh viên: ");
        String code = sc.nextLine();
        System.out.print("Tên sinh viên: ");
        String name = sc.nextLine();
        System.out.print("Ngày sinh (Năm-Tháng-Ngày): ");
        String dob = sc.nextLine();
        System.out.print("Giới tính: ");
        String gender = sc.nextLine();
        System.out.print("Nơi sinh: ");
        String pob = sc.nextLine();
        System.out.print("Điểm trung bình: ");
        float avgmark = sc.nextFloat();
        sc.nextLine();
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, code);
            pst.setString(2, name);
            pst.setString(3, dob);
            pst.setString(4, gender);
            pst.setString(5, pob);
            pst.setFloat(6, avgmark);
            pst.executeUpdate();
            System.out.println("Thêm sinh viên thành công!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateSV() {
        sql = "UPDATE tblstudent SET name = ?, dob =?, gender = ?, pob = ?, "
                + "avgmark = ? WHERE code = ?";
        System.out.println("Cập nhật thông tin sinh viên");
        System.out.print("Mã sinh viên để cập nhật: ");
        String code = sc.nextLine();
        System.out.print("Tên sinh viên: ");
        String name = sc.nextLine();
        System.out.print("Ngày sinh (Năm-Tháng-Ngày): ");
        String dob = sc.nextLine();
        System.out.print("Giới tính: ");
        String gender = sc.nextLine();
        System.out.print("Nơi sinh: ");
        String pob = sc.nextLine();
        System.out.print("Điểm trung bình: ");
        float avgmark = sc.nextFloat();
        sc.nextLine();
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, code);
            pst.setString(2, name);
            pst.setString(3, dob);
            pst.setString(4, gender);
            pst.setString(5, pob);
            pst.setFloat(6, avgmark);
            pst.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteSV() {
        sql = "DELETE FROM tblstudent WHERE code = ?";
        System.out.println("Xoá sinh viên!");
        System.out.print("Nhập mã sinh viên cần xoá: ");
        String code = sc.nextLine();
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, code);
            pst.executeUpdate();
            System.out.println("Đã xoá sinh viên " + code);
        } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sxN() {
//        Sắp xếp theo tên a.k.a name
        ArrayList<Student> als = getAllStudent();
        Collections.sort(als, new sortN());
        ir = als.iterator();
        System.out.println("Danh sách sinh viên");
        System.out.printf("%-12s%-15s%-22s%-12s%-11s%-22s%-16s\n", "ID",
                "Mã sinh viên", "Họ tên", "Ngày sinh", "Giới tính", "Quê quán",
                "Điểm trung bình");
        while (ir.hasNext()) {
            Student st = (Student) ir.next();
            System.out.println(st);
        }
    }

    public void sxC() {
//        Sắp xếp theo mã sinh viên a.k.a code
        ArrayList<Student> als = getAllStudent();
        Collections.sort(als, new sortC());
        ir = als.iterator();
        System.out.println("Danh sách sinh viên");
        System.out.printf("%-12s%-15s%-22s%-12s%-11s%-22s%-16s\n", "ID",
                "Mã sinh viên", "Họ tên", "Ngày sinh", "Giới tính", "Quê quán",
                "Điểm trung bình");
        while (ir.hasNext()) {
            Student st = (Student) ir.next();
            System.out.println(st);
        }
    }

    public void sxI() {
//        Sắp xếp theo ID a.k.a Id
        ArrayList<Student> als = getAllStudent();
        Collections.sort(als, new sortI());
        ir = als.iterator();
        System.out.println("Danh sách sinh viên");
        System.out.printf("%-12s%-15s%-22s%-12s%-11s%-22s%-16s\n", "ID",
                "Mã sinh viên", "Họ tên", "Ngày sinh", "Giới tính", "Quê quán",
                "Điểm trung bình");
        while (ir.hasNext()) {
            Student st = (Student) ir.next();
            System.out.println(st);
        }
    }

    public void HocBong() {
        ArrayList<Student> als = getAllStudent();
        List<Student> ls = new ArrayList<Student>();
        System.out.println("Danh sách sinh viên có học bổng 3 000 000 đồng/tháng");
        System.out.printf("%-12s%-15s%-22s%-12s%-11s%-22s%-16s\n", "ID",
                "Mã sinh viên", "Họ tên", "Ngày sinh", "Giới tính", "Quê quán",
                "Điểm trung bình");
        for (Student st : als) {
            if (st.getAvgmark() >= 3.8) {
                ls.add(st);
                System.out.println("");
            }
        }
        System.out.println(ls);
    }
}
