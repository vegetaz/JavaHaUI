/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nvdemo;
import java.util.Scanner;
/**
 *
 * @author veget
 */
public class NVDemo {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n;
        NV listNV[];//Khai báo mảng nhân viên
        System.out.print("Số lượng nhân viên: ");
        n =  sn.nextInt();
        listNV = new NV[n];//Xin cấp phát mảng
        for (int i = 0; i < n; i++) {
            listNV[i] = new NV();//Xin cấp phát đối tượng
            listNV[i].nhap();
        }
        System.out.println("Danh sách nhân viên: ");
        NV.OutTitle();
        for (int i = 0; i < n; i++) {
            listNV[i].xuat();
        }
    }
}
