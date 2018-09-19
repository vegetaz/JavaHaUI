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
public class NgayThang {
    private int ngay;
    private int thang;
    private int nam;
    //Constructor không đối số
    public NgayThang() {
        //
    }
    //Constructor có đối số
    public NgayThang(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    //setter
    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
    public void setThang(int thang) {
        this.thang = thang;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }
    //getter
    public int getNgay() {
        return ngay;
    }
    public int getThang() {
        return thang;
    }
    public int getNam() {
        return nam;
    }
    //Hàm nhập
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Ngày: ");
        ngay = sn.nextInt();
        System.out.print("Tháng: ");
        thang = sn.nextInt();
        System.out.print("Năm: ");
        nam = sn.nextInt();
    }
    //Hàm xuất
    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}
