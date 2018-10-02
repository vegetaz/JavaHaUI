/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

/**
 *
 * @author T7-PC-06
 */
public class LaoDongPhoThong extends NguoiLaoDong{
    private int soNgayCong;
    private float donGiaNC;

    public LaoDongPhoThong() {
    }

    public LaoDongPhoThong(int soNgayCong, float donGiaNC, String hoTen, String diaChi, int loaiLaoDong) {
        super(hoTen, diaChi, loaiLaoDong);
        this.soNgayCong = soNgayCong;
        this.donGiaNC = donGiaNC;
    }

    public LaoDongPhoThong(int loaiLaoDong) {
        super(1);
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public float getDonGiaNC() {
        return donGiaNC;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public void setDonGiaNC(float donGiaNC) {
        this.donGiaNC = donGiaNC;
    }
    
    @Override
    public double tinhLuong() {
        double luongThang = 0;
        int thuong1 = 1000000;
        int thuong2 = 700000;
        if (soNgayCong < 25) {
            luongThang = (double) soNgayCong * donGiaNC + thuong2;
        } else {
            luongThang = (double) soNgayCong * donGiaNC + thuong1;
        }
        return luongThang;
    }
    
}
