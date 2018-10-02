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
public class Bai11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GVCoHuu gv = new GVCoHuu();
        gv.setHeSoLuong(3500);
        gv.setLuongCB(5500000);
        gv.nhapThongTin();
        gv.tinhLuong();
        gv.inThongTin();
        //
        GVThinhGiang gv2 = new GVThinhGiang();
        gv2.setDonGia(150000);
        gv2.setSoTietDay(125);
        gv2.nhapThongTin();
        gv2.tinhLuong();
        gv2.inThongTin();
    }

}
