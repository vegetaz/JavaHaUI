/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai04;

/**
 *
 * @author veget
 */
public class Bai04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BenhNhan bn = new BenhNhan();
        BenhVien bv = new BenhVien();
        bn.setName("Hấp Văn Sứt");
        bn.setAge(5);
        bn.setGender('M');
        bn.setTienSu("Cáu bẳn, nóng tính");
        bn.setChanDoan("Mọc răng vĩnh viễn!");
        bv.setTen("Thú Y Chó Mèo");
        bv.setDiaChi("Số 1, Văn Cao");
        bv.setGiamDoc("Không biết!");
        bn.setBenhVien(bv);
        System.out.println(bn);
    }
    
}
