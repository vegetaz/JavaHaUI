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
public class HocVienDH extends HocVien {
    private int soBuoi;
    private float donGiaDH;
    private int uuTien;
    final float ut1 = 1000000f;
    final float ut2 = 500000f;
    //Hàm khởi tạo
    public HocVienDH() {
        //
    }
    //
    public HocVienDH(int soBuoi, float donGiaDH, int uuTien, String hoTen, String diaChi, int loaiChuongTrinh) {
        super(hoTen, diaChi, loaiChuongTrinh);
        this.soBuoi = soBuoi;
        this.donGiaDH = donGiaDH;
        this.uuTien = uuTien;
    }
    //getter
    public int getSoBuoi() {
        return soBuoi;
    }

    public float getDonGiaDH() {
        return donGiaDH;
    }

    public int getUuTien() {
        return uuTien;
    }
    //setter

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    public void setDonGiaDH(float donGiaDH) {
        this.donGiaDH = donGiaDH;
    }

    @Override
    public void setUuTien(int uuTien) {
        this.uuTien = uuTien;
    }
    
    @Override
    public void hocPhi() {
        float hocphi;
        switch (uuTien) {
            case 1:
                hocphi = soBuoi * donGiaDH - ut1;
                break;
            case 2:
                hocphi = soBuoi * donGiaDH - ut2;
                break;
        }
    }
    
}
