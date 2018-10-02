/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

/**
 *
 * @author T7-PC-06
 */
public class CNKSP extends CongNhan {
    private int soSanPham;
    private int donGiaSP;

    public CNKSP() {
    }

    public CNKSP(int soSanPham, int donGiaSP, String hoTen, String diaChi, int loaiCongNhan, String ngaySinh) {
        super(hoTen, diaChi, loaiCongNhan, ngaySinh);
        this.soSanPham = soSanPham;
        this.donGiaSP = donGiaSP;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public int getDonGiaSP() {
        return donGiaSP;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public void setDonGiaSP(int donGiaSP) {
        this.donGiaSP = donGiaSP;
    }
        
    @Override
    public double tinhLuong() {
        final int base = 1000;
        double luong = 0;
        int t1 = 1000000;
        int t2 = 1500000;
        int thuong = soSanPham - base;
        if (thuong >= 100 && thuong < 150) {
            luong = (double) soSanPham * donGiaSP + t1;
        }
        if (thuong >= 150) {
            luong = (double) soSanPham * donGiaSP + t2;
        }
        return luong;
    }
    
}
