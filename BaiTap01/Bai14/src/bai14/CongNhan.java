/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import java.util.Scanner;

/**
 *
 * @author T7-PC-06
 */
public abstract class CongNhan {
    private String hoTen;
    private String diaChi;
    private int loaiCongNhan;
    private String ngaySinh;

    public CongNhan() {
    }

    public CongNhan(String hoTen, String diaChi, int loaiCongNhan, String ngaySinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiCongNhan = loaiCongNhan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getLoaiCongNhan() {
        return loaiCongNhan;
    }
    
    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLoaiCongNhan(int loaiCongNhan) {
        this.loaiCongNhan = loaiCongNhan;
    }
    
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public void nhapThongTin() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Họ tên: ");
        hoTen = sn.nextLine();
        System.out.print("Ngày sinh: ");
        ngaySinh = sn.nextLine();
        System.out.print("Địa chỉ: ");
        diaChi = sn.nextLine();
        System.out.println("Loại công nhân");
        System.out.print("1. CNKSP, 2. CNTCN: ");
        loaiCongNhan = sn.nextInt();
    }
    public abstract double tinhLuong();
    
    public void inThongTin() {
        System.out.println("Thông tin công nhân");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Loại công nhân: " + loaiCongNhan);
        System.out.println("Lương tháng: " + tinhLuong());
    } 
}
