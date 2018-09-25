/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

import java.util.Scanner;

/**
 *
 * @author nghien
 */
public class NgayThang {
     private int ngay;
     private int thang;
     private int nam;

    public NgayThang(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public NgayThang() {
    }

    public int getNgay() {
        return ngay;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam ;
    }
    public void nhap(){
        Scanner sn = new Scanner(System.in);
        System.out.print("Moi nhap ngay:");
        ngay = sn.nextInt();
        System.out.print("Moi nhap thang:");
        thang = sn.nextInt();
        System.out.print("Moi nhap nam:");
        nam = sn.nextInt();
        
        
    }
     
}
