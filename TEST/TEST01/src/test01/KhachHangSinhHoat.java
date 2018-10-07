/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test01;

/**
 *
 * @author veget
 */
public class KhachHangSinhHoat extends KhachHang {

    int soDienTieuThu;
    final int BASE1 = 1000;
    double tienDien;
    private String gioiTinh;

    public KhachHangSinhHoat() {
        //
    }

    public KhachHangSinhHoat(String maKhachHang, String tenKhachHang, String diaChi, int soDienThoai, int chiSoDau, int chiSoCuoi, String gioiTinh) {
        super(maKhachHang, tenKhachHang, diaChi, soDienThoai, chiSoDau, chiSoCuoi);
        this.gioiTinh = gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public double tienDien() {
        soDienTieuThu = getChiSoCuoi() - getChiSoDau();
        if (soDienTieuThu > 0 && soDienTieuThu <= 50) {
            tienDien = soDienTieuThu * BASE1;
        } else if (soDienTieuThu <= 100) {
            tienDien = soDienTieuThu * BASE1;
        } else {
            tienDien = soDienTieuThu * BASE1;
        }
        return tienDien;
    }

}
