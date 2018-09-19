/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidu26;
import java.util.Scanner;
/**
 *
 * @author veget
 */
public class NhanVien {
    private String name;
    private NgayThang dob;
    //Constructor không đối số
    public NhanVien() {
        //
    }
    public NhanVien(String name, NgayThang dob) {
        this.name = name;
        this.dob = dob;
    }
    //getter
    public String getName() {
        return name;
    }
    public NgayThang getDob() {
        return dob;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setDob(NgayThang dob) {
        this.dob = dob;
    }
    //Hàm nhập
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Tên: ");
        name = sn.nextLine();
        System.out.println("Ngày sinh");
        dob = new NgayThang();
        dob.nhap();
    }
    //Hàm xuất
    public void xuat() {
        System.out.println("Thông tin cá nhân");
        System.out.println("Họ tên: " + name);
        System.out.println("Ngày sinh: " + dob);
    }
}
