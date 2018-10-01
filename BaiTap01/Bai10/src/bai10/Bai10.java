/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;
import java.util.Scanner;
/**
 *
 * @author Vegetaz
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
//        HocVienDH dh = new HocVienDH();
//        dh.nhapThongTin();
//        dh.setSoBuoi(25);
//        dh.setDonGiaDH(150000);
//        dh.inThongTin();
        //
        HocVienLT lt = new HocVienLT();
        lt.nhapThongTin();
        lt.setDonGiaLT(250000);
        lt.setSoBuoi(25);
        lt.inThongTin();
    }
    
}
