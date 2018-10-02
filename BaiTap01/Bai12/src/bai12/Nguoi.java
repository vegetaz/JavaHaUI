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
    private String ngaySinh;
    private String diaChi;
    private int loaiSV;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String ngaySinh, String diaChi, int loaiSV) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.loaiSV = loaiSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getLoaiSV() {
        return loaiSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLoaiSV(int loaiSV) {
        this.loaiSV = loaiSV;
    }

    public void nhapThongTin() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Họ tên: ");
        hoTen = sn.nextLine();
        System.out.print("Ngày sinh: ");
        ngaySinh = sn.nextLine();
        System.out.print("Địa chỉ: ");
        diaChi = sn.nextLine();
        System.out.println("Loại sinh viên");
        System.out.print("1. SVCDN, 2. SVCDCQ: ");
        loaiSV = sn.nextInt();
    }

    public abstract float tinhDiem();

    public void inThongTin() {
        System.out.println("Thông tin sinh viên");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + hoTen);
        System.out.println("Địa chỉ: " + hoTen);
        if (loaiSV == 1) {
            System.out.println("Sinh viên cao đẳng nghề");
        } else {
            System.out.println("Sinh viên cao đẳng chính quy");

        }
        System.out.println("Điểm trung bình: " + tinhDiem());
    }
}
