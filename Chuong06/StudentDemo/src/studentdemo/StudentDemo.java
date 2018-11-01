/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class StudentDemo {

    static Scanner sc;

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== Menu =====");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo ID");
            System.out.println("4. Sắp xếp sinh viên theo tên");
            System.out.println("5. Xoá sinh viên");
            System.out.println("6. Thoát chương trình");
            System.out.print("?!? Chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sm.Inserts();
                    break;
                case 2:
                    sm.view();
                    break;
                case 3:
                    sm.search();
                    break;
                case 4:
                    sm.sortSV();
                    break;
                case 5:
                    sm.delete();
                    break;
                case 6:
                    System.out.println("Thoát");
                    break;
            }
        } while (choice != 6);
    }
}
