/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.Calendar;

/**
 *
 * @author veget
 */
public class GVCoHuu extends GiangVien {

    private float luongThang;
    private float luongCB;
    private float heSoLuong;
    private int namVaoLam;

    public GVCoHuu() {
    }

    public GVCoHuu(float luongThang, float luongCB, float heSoLuong, int namVaoLam, String hoTen, String diaChi, int loaiGiangVien) {
        super(hoTen, diaChi, loaiGiangVien);
        this.luongThang = luongThang;
        this.luongCB = luongCB;
        this.heSoLuong = heSoLuong;
        this.namVaoLam = namVaoLam;
    }

    public float getLuongThang() {
        return luongThang;
    }

    public float getLuongCB() {
        return luongCB;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public void setLuongThang(float luongThang) {
        this.luongThang = luongThang;
    }

    public void setLuongCB(float luongCB) {
        this.luongCB = luongCB;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }

    @Override
    public float tinhLuong() {
        Calendar cd = Calendar.getInstance();
        int nht = cd.get(Calendar.YEAR);
        int namLamViec = nht - namVaoLam;
        if (namLamViec < 5) {
            luongThang = (float) luongCB * heSoLuong;
        } else {
            luongThang = (float) luongCB * heSoLuong + ((namLamViec + 1) % 100) * luongCB;
        }
        return luongThang;
    }

}
