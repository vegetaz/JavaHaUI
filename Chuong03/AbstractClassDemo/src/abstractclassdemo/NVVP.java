/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclassdemo;

/**
 *
 * @author veget
 */
public class NVVP extends NhanVien {

    private float mucLuong;
    private int soNgayNghi;
    final float PHAT = 20000f;

    public NVVP() {
    }

    public NVVP(float mucLuong, int soNgayNghi) {
        this.mucLuong = mucLuong;
        this.soNgayNghi = soNgayNghi;
    }

    public NVVP(float mucLuong, int soNgayNghi, String hoTen, int namVaoLam) {
        super(hoTen, namVaoLam);
        this.mucLuong = mucLuong;
        this.soNgayNghi = soNgayNghi;
    }

    public float getMucLuong() {
        return mucLuong;
    }

    public int getSoNgayNghi() {
        return soNgayNghi;
    }

    public void setMucLuong(float mucLuong) {
        this.mucLuong = mucLuong;
    }

    public void setSoNgayNghi(int soNgayNghi) {
        this.soNgayNghi = soNgayNghi;
    }

    // @Override
    public float tinhLuong() {
        float luong = 0f;
        luong = mucLuong - soNgayNghi * PHAT;
        return luong;
    }

}
