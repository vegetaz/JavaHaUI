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
public class NVSX extends NhanVien {

    private int sanPham;
    final float TIEN = 20000;

    public NVSX() {
    }

    public NVSX(int sanPham, String hoTen, int namVaoLam) {
        super(hoTen, namVaoLam);
        this.sanPham = sanPham;
    }

    public int getSanPham() {
        return sanPham;
    }

    public void setSanPham(int sanPham) {
        this.sanPham = sanPham;
    }

    @Override
    public float tinhLuong() {
        float luong = 0f;
        luong = sanPham * TIEN;
        return luong;
    }

}
