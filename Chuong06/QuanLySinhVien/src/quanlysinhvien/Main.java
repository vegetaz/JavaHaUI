/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Sửa sinh viên theo mã sinh viên");
        System.out.println("3. Xoá sinh viên theo mã sinh viên");
        System.out.println("4. Sắp xếp sinh viên theo điểm trung bình.");
        System.out.println("5. Sắp xếp sinh viên theo tên");
        System.out.println("6. Hiển thị sinh viên");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Lựa chọn: ");
    }
    
    public static void main(String[] args) {
        StudentDao st = new StudentDao();
        st.openConn();
        ArrayList<Student> al = st.getAllStudent();
        Iterator<Student> ir = al.iterator();
        while (ir.hasNext()) {
            Student student = ir.next();
            System.out.println(student);
        }
    }
}
