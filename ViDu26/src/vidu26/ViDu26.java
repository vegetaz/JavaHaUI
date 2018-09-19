/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidu26;
import java.util.Scanner;
/**
 *
 * @author veget
 */
public class ViDu26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n; //số lượng người
        NhanVien dsNV[]; //Khai báo mảng ds
        System.out.print("Số lượng người: ");
        n = sn.nextInt();
        dsNV = new NhanVien[n]; //Cấp phát mảng
        for (int i = 0; i < n; i++) {
            dsNV[i] = new NhanVien();
            dsNV[i].nhap();
        }
        System.out.println("Danh sách: ");
        NhanVien.xuatTieuDe();
        for (int i = 0; i < n; i++) {
            dsNV[i].xuat();
        }
        
    }
    
}
