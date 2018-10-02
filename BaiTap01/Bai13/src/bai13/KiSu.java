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
public class KiSu extends NguoiLaoDong {
    private double luongCB;
    private float heSoLuong;
    private int soNgayCong;

    public KiSu() {
    }

    public KiSu(double luongCB, float heSoLuong, int soNgayCong, String hoTen, String diaChi, int loaiLaoDong) {
        super(hoTen, diaChi, loaiLaoDong);
        this.luongCB = luongCB;
        this.heSoLuong = heSoLuong;
        this.soNgayCong = soNgayCong;
    }

    public KiSu(int loaiLaoDong) {
        super(2);
    }

    public double getLuongCB() {
        return luongCB;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
    
    @Override
    public double tinhLuong() {
        double luong = 0;
        double thuong1 = 1000000;
        double thuong2 = 2000000;
        if (soNgayCong < 25) {
            luong = (double) luongCB * heSoLuong + thuong1;
        } else {
            luong = (double) luongCB * heSoLuong + thuong2;
        }
        return luong;
    }
    
}
