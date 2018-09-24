/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public abstract class HocVien {
    private String hoTen;
    private String diaChi;
    private int loaiChuongTrinh;
    private int uuTien;
    //Constructor không đối số
    public HocVien(){
        //
    }
    //Constructor - Hàm khởi tạo
    public HocVien(String hoTen, String diaChi, int loaiChuongTrinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiChuongTrinh = loaiChuongTrinh;
        this.uuTien = uuTien;
    }
    //getter
    public String getHoTen() {
        return hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public int getLoaiChuongTrinh() {
        return loaiChuongTrinh;
    }
    public int getUuTien() {
        return uuTien;
    }
    //setter
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void setLoaiChuongTrinh(int loaiChuongTrinh) {
        this.loaiChuongTrinh = loaiChuongTrinh;
    }
    public void setUuTien(int uuTien) {
        this.uuTien = uuTien;
    }
    public void nhapThongTin() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Họ tên: ");
        hoTen = sn.nextLine();
        System.out.print("Địa chỉ: ");
        diaChi = sn.nextLine();
        System.out.print("Loại ưu tiên: ");
        uuTien = sn.nextInt();
        System.out.print("Loại chương trình đăng ký: ");
        loaiChuongTrinh = sn.nextInt();
    }
    
    public abstract void hocPhi();
    
    public void inThongTin() {
        System.out.println("Thông tin học viên");
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Địa chỉ: " + this.diaChi);
        System.out.println("Chương trình: " + this.loaiChuongTrinh);
        System.out.println("Ưu tiên: " + this.uuTien);
        switch(loaiChuongTrinh) {
            case 1:
                HocVienDH dh = new HocVienDH();
                dh.hocPhi();
            case 2:
                HocVienLT lt = new HocVienLT();
                lt.hocPhi();
        }
    }
}
