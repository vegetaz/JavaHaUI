/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai03;

/**
 *
 * @author veget
 */
public class Bai03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.setName("Mèo Văn Sứt");
        DiaChi dc = new DiaChi();
        dc.setThon("Thôn");
        dc.setXa("Xã");
        dc.setHuyen("Huyện");
        dc.setTinh("Tỉnh");
        nv.setAddress(dc);
        nv.setDob("05/04/2018");
        nv.setGender('M');
        System.out.println(nv);
    }
    
}
