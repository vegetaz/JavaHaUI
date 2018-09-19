/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidu25n;
import java.util.Scanner;
/**
 *
 * @author Vegetaz
 */
public class Times {
    private int ngay;
    private int thang;
    private int nam;
    //Constructor không đối số
    public Times(){
        //
    }
    //Constructor có đối số
    public Times(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    //Setter
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
    void nhap(){
        System.out.print("Ngày: ");
        Scanner sn = new Scanner(System.in);
        ngay = sn.nextInt();
        System.out.print("Tháng: ");
        thang = sn.nextInt();
        System.out.print("Năm: ");
        nam = sn.nextInt();
    }
    //Hàm xuất
    @Override
    public String toString() {
        return "Sinh ngày: " + ngay + "/" + thang + "/" + nam;
    }
}
