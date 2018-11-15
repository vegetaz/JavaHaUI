/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapcoban;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan08 {
    public static void main(String[] args) {
        //Khai báo
        ArrayList aThongTin = new ArrayList();
        //Gán giá trị
        aThongTin.add("Văn Vận");
        aThongTin.add("25101989");
        aThongTin.add(new Date());
        //Hiển thị thông tin
        System.out.println("Mảng danh sách động");
        for (Object object : aThongTin) {
            System.out.println(object);
        }
    }
}
