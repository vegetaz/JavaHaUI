/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

/**
 *
 * @author veget
 */
public class GVThinhGiang extends GiangVien {

    private int soTietDay;
    private float donGia;

    public GVThinhGiang() {
    }

    public GVThinhGiang(int soTietDay, float donGia, String hoTen, String diaChi, int loaiGiangVien) {
        super(hoTen, diaChi, loaiGiangVien);
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    @Override
    public float tinhLuong() {
        float luongThang = 0;
        float thuNhap = (float) 0.15 * soTietDay * donGia;
        luongThang = (float) soTietDay * donGia - thuNhap;
        return luongThang;
    }

}
