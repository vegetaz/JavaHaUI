/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

/**
 *
 * @author Vegetaz
 */
public class HocVienLT extends HocVien {
    private int soBuoi;
    private float donGiaLT;
    private int uuTien;
    final float ut1 = 1000000f;
    final float ut2 = 800000f;

    public HocVienLT() {
    }

    public HocVienLT(int soBuoi, float donGiaLT, int uuTien, String hoTen, String diaChi, int loaiChuongTrinh) {
        super(hoTen, diaChi, loaiChuongTrinh);
        this.soBuoi = soBuoi;
        this.donGiaLT = donGiaLT;
        this.uuTien = uuTien;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public float getDonGiaLT() {
        return donGiaLT;
    }

    public int getUuTien() {
        return uuTien;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    public void setDonGiaLT(float donGiaLT) {
        this.donGiaLT = donGiaLT;
    }

    public void setUuTien(int uuTien) {
        this.uuTien = uuTien;
    }
    
    @Override
    public void hocPhi() {
        float hocphi;
        switch (uuTien) {
            case 1:
                hocphi = soBuoi * donGiaLT - ut1;
                break;
            case 2:
                hocphi = soBuoi * donGiaLT - ut2;
                break;
        }
    }
    
}
