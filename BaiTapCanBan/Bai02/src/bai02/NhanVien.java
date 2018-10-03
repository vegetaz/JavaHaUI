/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai02;

/**
 *
 * @author veget
 */
public class NhanVien extends CanBo {

    private String congViec;

    public NhanVien() {
        //Hàm khởi tạo không đối số
    }

    public NhanVien(String hoTen, int namSinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }
}
