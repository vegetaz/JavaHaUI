/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.Scanner;

/**
 *
 * @author veget
 */
public abstract class GiangVien {

    private String hoTen;
    private String diaChi;
    private int loaiGiangVien;

    public GiangVien() {
        //
    }

    public GiangVien(String hoTen, String diaChi, int loaiGiangVien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiGiangVien = loaiGiangVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getLoaiGiangVien() {
        return loaiGiangVien;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setLoaiGiangVien(int loaiGiangVien) {
        this.loaiGiangVien = loaiGiangVien;
    }

    public void nhapThongTin() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Họ tên: ");
        this.hoTen = sn.nextLine();
        System.out.print("Địa chỉ: ");
        this.diaChi = sn.nextLine();
        System.out.print("(1. Giảng viên cơ hữu, 2. Giảng viên thỉnh giảng): ");
        this.loaiGiangVien = sn.nextInt();
    }

    public abstract float tinhLuong();

    public void inThongTin() {
        System.out.println("Thông tin giảng viên");
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Địa chỉ: " + this.diaChi);
        switch (this.loaiGiangVien) {
            case 1:
                System.out.println("Giảng viên cơ hữu");
                break;
            case 2:
                System.out.println("Giảng viên thỉnh giảng");
                break;
        }
        System.out.println("Lương tháng: " + tinhLuong());
    }
}
