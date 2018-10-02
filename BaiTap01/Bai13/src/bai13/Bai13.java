/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

/**
 *
 * @author T7-PC-06
 */
public class Bai13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        LaoDongPhoThong ld1 = new LaoDongPhoThong();
        ld1.setDonGiaNC(150000);
        ld1.setSoNgayCong(26);
        ld1.nhapThongTin();
        ld1.tinhLuong();
        ld1.inThongTin();
        //
        KiSu ld2 = new KiSu();
        ld2.setSoNgayCong(26);
        ld2.setLuongCB(2500000);
        ld2.setHeSoLuong(25000);
        ld2.nhapThongTin();
        ld2.tinhLuong();
        ld2.inThongTin();
    }    
}
