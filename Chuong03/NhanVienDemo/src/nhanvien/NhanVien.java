/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author nghien
 */
public class NhanVien {
    private String hoDem;
    private String ten;
    private NgayThang ngaySinh;//
    private NgayThang ngayVaoLam;

    public NhanVien(String hoDem, String ten, NgayThang ngaySinh, NgayThang ngayVaoLam) {
        this.hoDem = hoDem;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
    }

    public NhanVien() {
    }

    public String getHoDem() {
        return hoDem;
    }

    public String getTen() {
        return ten;
    }

    public NgayThang getNgaySinh() {
        return ngaySinh;
    }

    public NgayThang getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNgaySinh(NgayThang ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setNgayVaoLam(NgayThang ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
    public void nhap(){
        Scanner sn = new Scanner(System.in);
        System.out.print("Moi nhap ho dem:");
        hoDem = sn.nextLine();
        System.out.print("Moi nhap ten:");
        ten = sn.nextLine();
        //nhap ngay thang năm sinh
        System.out.println("Nhập ngày tháng năm sinh:");
        ngaySinh = new NgayThang();
        ngaySinh.nhap();
        ngayVaoLam = new NgayThang();
        System.out.println("Nhập ngày vào làm");
        ngayVaoLam.nhap();
        
    }
    public static void xuatTieuDe(){
        System.out.printf("%20s%30s%40s%60s","Ho dem","Ten","Ngay sinh","Ngay vao lam");
    }
    public void xuat(){
        System.out.printf("\n%20s%30s%40s%60s",hoDem,ten,ngaySinh,ngayVaoLam);
    }
}
