/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhviendemo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class SinhVienDemo {

    /**
     * @param args the command line arguments
     */
    static Scanner sc;
    public static void main(String[] args) {
        ViewSinhVien viewsv = new ViewSinhVien();
        ArrayList<SinhVien> as = viewsv.viewSV();
        InsertSinhVien ins = new InsertSinhVien();
        DeleteSinhVien dels = new DeleteSinhVien();
        SortSinhVien sors = new SortSinhVien();
        SearchSinhVien sears = new SearchSinhVien();
        int choice;
        sc = new Scanner(System.in);
        do {
            System.out.println("===== Danh Sách Chức Năng =====");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Sắp xếp sinh viên theo tên");
            System.out.println("5. Xoá sinh viên");
            System.out.println("6. Thoát chương trình");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ins.insertSV();
                    break;
                case 2:
                    viewsv.viewSV();
                    break;
                case 3:
                    sears.searchSV();
                    break;
                case 4:
                    sors.sortSV();
                    break;
                case 5:
                    dels.deleteSV();
                    break;
                case 6:
                    System.out.println("Thoát...");
                    break;
            }
        } while (choice != 6);
    }

}
