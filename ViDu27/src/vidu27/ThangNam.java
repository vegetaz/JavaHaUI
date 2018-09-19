/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidu27;
import java.util.Scanner;
/**
 *
 * @author veget
 */
public class ThangNam {
    private int ngay;
    private int thang;
    private int nam;
    //Constructor
    public ThangNam() {
        //
    }
    //Constructor
    public ThangNam(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
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
    //Input
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Day: ");
        ngay = sn.nextInt();
        System.out.print("Month: ");
        thang = sn.nextInt();
        System.out.print("Year: ");
        nam = sn.nextInt();
    }
    //Output
    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}
