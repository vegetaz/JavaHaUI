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

    private float luongThang;
    private int soTietDay;
    private float donGia;

    public GVThinhGiang() {
    }

    public GVThinhGiang(float luongThang, int soTietDay, float donGia, String hoTen, String diaChi, int loaiGiangVien) {
        super(hoTen, diaChi, loaiGiangVien);
        this.luongThang = luongThang;
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }

    public float getLuongThang() {
        return luongThang;
    }

    public int getSoTietDay() {
        return soTietDay;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setLuongThang(float luongThang) {
        this.luongThang = luongThang;
    }

    public void setSoTietDay(int soTietDay) {
        this.soTietDay = soTietDay;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    @Override
    public float tinhLuong() {
        float thuNhap = (float) 0.15 * soTietDay * donGia;
        luongThang = (float) soTietDay * donGia - thuNhap;
        return luongThang;
    }

}
