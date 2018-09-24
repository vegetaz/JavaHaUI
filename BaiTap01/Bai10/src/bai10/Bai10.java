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
        Scanner sn = new Scanner(System.in);
        HocVien dh = new HocVienDH();
        dh.nhapThongTin();
        dh.hocPhi();
        dh.inThongTin();  
    }
    
}
