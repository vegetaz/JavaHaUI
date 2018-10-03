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
public class CongNhan extends CanBo {

    private String bac;

    public CongNhan() {
        //
    }

    public CongNhan(String hoTen, int namSinh, String gioiTinh, String diaChi, String bac) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }
}
