/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astractclassdemo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author nghien
 */
public class AstractClassDemo {

    NhanVien a[];

    public AstractClassDemo(int n) {
        a = new NhanVien[n];//tao mang luu duoc n nhan vien
    }

    public void nhap() {//Nhap thong tin cho mang a
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Moi nhap ten nhan vien thu " + (i + 1) + ":");
            String name = sn.nextLine();
            System.out.print("Moi nhap nam vao lam cua nhan vien thu " + (i + 1) + ":");
            int nvl = sn.nextInt();
            //xoa dau enter
            sn.nextLine();
            System.out.print("Ban nhap loai nhan vien:(1:Nhan vien san xuat, 2:Nhan vien van phong):");
            int choice = sn.nextInt();
            switch (choice) {
                case 1://nhan vien san xuat
                    System.out.print("Moi nhap so san pham:");
                    int ssp = sn.nextInt();
                    //xoa bo dem
                    sn.nextLine();
                    a[i] = new NVSX(ssp, name, nvl);
                    break;
                case 2://nhan vien van phong
                    System.out.print("Moi nhap muc luong:");
                    float ml = sn.nextFloat();
                    System.out.print("Moi nhap so ngay nghi:");
                    int snn = sn.nextInt();
                    sn.nextLine();
                    a[i] = new NVVP(ml, snn, name, nvl);
                    break;
            }
        }

    }
    
    public void xuat() {
        System.out.println("Danh sach nhan vien san xuat");
        System.out.printf("%30s%20s%20s%20s%20s","Ho va ten","Nam vao lam","Luong","Thuong","Thu nhap");
        for(int i=0;i<a.length;i++){
            if(a[i] instanceof NVSX){
                System.out.printf("\n%30s%20d%20.2f%20.2f%20.2f",a[i].getHoTen(),a[i].getNamVaoLam(),a[i].tinhLuong(),a[i].tinhThuong(),a[i].tinhLuong()+a[i].tinhThuong());
            }
        }
        System.out.println("\nDanh sach nhan vien van phong");
        System.out.printf("%30s%20s%20s%20s%20s","Ho va ten","Nam vao lam","Luong","Thuong","Thu nhap");
        for(int i=0;i<a.length;i++){
            if(a[i] instanceof NVVP){
                System.out.printf("\n%30s%20d%20.2f%20.2f%20.2f",a[i].getHoTen(),a[i].getNamVaoLam(),a[i].tinhLuong(),a[i].tinhThuong(),a[i].tinhLuong()+a[i].tinhThuong());
            }
        }
        
    }
    public float tinhTongTien(){
        float sum = 0f;
        for(int i=0;i<a.length;i++){
            sum+=a[i].tinhLuong()+a[i].tinhThuong();
        }
        return sum;
    }
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("0.00");
       AstractClassDemo abd = new AstractClassDemo(4);
       abd.nhap();
       abd.xuat();
       System.out.println("\nTong tien phai tra la:"+df.format(abd.tinhTongTien()));
    }

}
