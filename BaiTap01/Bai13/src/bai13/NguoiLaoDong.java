/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

import java.util.Scanner;

/**
 *
 * @author T7-PC-06
 */
public abstract class NguoiLaoDong {
    private String hoTen;
    private String diaChi;
    private int loaiLaoDong;

    public NguoiLaoDong() {
    }

    public NguoiLaoDong(int loaiLaoDong) {
        this.loaiLaoDong = loaiLaoDong;
    }

    public NguoiLaoDong(String hoTen, String diaChi, int loaiLaoDong) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiLaoDong = loaiLaoDong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getLoaiLaoDong() {
        return loaiLaoDong;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLoaiLaoDong(int loaiLaoDong) {
        this.loaiLaoDong = loaiLaoDong;
    }
    
    public void nhapThongTin() {
        Scanner  sn = new Scanner(System.in);
        System.out.print("Họ tên: ");
        hoTen = sn.nextLine();
        System.out.print("Địa chỉ: ");
        diaChi = sn.nextLine();
        System.out.println("Loại lao động: ");
        System.out.print("1. Lao động phổ thông, 2. Kĩ sư: ");
        loaiLaoDong = sn.nextInt();
    }
    
    public abstract double tinhLuong();
    
    public void inThongTin() {
        System.out.println("Thông tin người lao động");
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        if (loaiLaoDong == 1) {
            System.out.println("Lao động phổ thông");
        } else {
            System.out.println("Kĩ sư");
        }
        System.out.println("Lương tháng: " + tinhLuong());
    }
}
