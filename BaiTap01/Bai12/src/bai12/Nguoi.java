/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.util.Scanner;

/**
 *
 * @author veget
 */
public abstract class Nguoi {

    private String hoTen;
    private String dob;
    private String address;
    private Integer loaiSV;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String dob, String address, Integer loaiSV) {
        this.hoTen = hoTen;
        this.dob = dob;
        this.address = address;
        this.loaiSV = loaiSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public Integer getLoaiSV() {
        return loaiSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLoaiSV(Integer loaiSV) {
        this.loaiSV = loaiSV;
    }

    public void nhapThongTin() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Họ tên: ");
        hoTen = sn.nextLine();
        System.out.print("Ngày sinh: ");
        dob = sn.nextLine();
        System.out.print("Địa chỉ: ");
        address = sn.nextLine();
        System.out.printf("1. Sinh viên cao đẳng nghề\n"
                + "2. Sinh viên cao đẳng chính quy: \n");
        loaiSV = sn.nextInt();
    }

    public abstract void tinhDiem();

    public void xuatThongTin() {
        System.out.println("Thông tin sinh viên");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + dob);
        System.out.println("Địa chỉ: " + address);
        switch (loaiSV) {
            case 1:
                System.out.println("Sinh viên cao đẳng nghề");
                break;
            case 2:
                System.out.println("Sinh viên cao đẳng chính quy");
                break;
        }
        System.out.println("Điểm trung bình: ");
    }
}
