/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphymdemo;

import java.util.Scanner;

/**
 *
 * @author nghien
 */

public class Hang {
    private String maHang;
    private String tenHang;
    private String nhaSanXuat;
    private double gia;

    public Hang() {
    }
    
    public Hang(String maHang, String tenHang, String nhaSanXuat, double gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhaSanXuat = nhaSanXuat;
        this.gia = gia;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Hang{" + "maHang=" + maHang + ", tenHang=" + tenHang + ", nhaSanXuat=" + nhaSanXuat + ", gia=" + gia + '}';
    }
    public void xuat(){
        System.out.printf("%10s%50s%50s%8.2f",maHang,tenHang,nhaSanXuat,gia);
    }
    public void nhap(){
        Scanner sn = new Scanner(System.in);
        System.out.print("Moi nhap ma hang:");
        maHang = sn.nextLine();
        System.out.print("Moi nhap ten hang:");
        tenHang = sn.nextLine();
        System.out.print("Moi nhap nha san xuat:");
        nhaSanXuat = sn.nextLine();
        System.out.print("Moi nhap gia hang:");
        gia = sn.nextDouble();
        
        
    }
    
}
