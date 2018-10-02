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
public class CNTCN extends CongNhan{
    private int luongCoBan;
    private float heSoLuong;
    private int soNNgayCong;

    public CNTCN() {
    }

    public CNTCN(int luongCoBan, float heSoLuong, int soNNgayCong, String hoTen, String diaChi, int loaiCongNhan, String ngaySinh) {
        super(hoTen, diaChi, loaiCongNhan, ngaySinh);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.soNNgayCong = soNNgayCong;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public int getSoNNgayCong() {
        return soNNgayCong;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setSoNNgayCong(int soNNgayCong) {
        this.soNNgayCong = soNNgayCong;
    }
       
    @Override
    public double tinhLuong() {
        double luong = 0;
        if (soNNgayCong < 20) {
            luong = (double) luongCoBan * heSoLuong;
        } else {
            luong = (double) luongCoBan * heSoLuong + (1.2 * luongCoBan);
        }       
        return luong;
    }
    
}
