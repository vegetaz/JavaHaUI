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
public class NT {
    private int date;
    private int month;
    private int year;
    Scanner sn = new Scanner(System.in);
    //Phương thức khởi tạo không đối số
    public NT() {
        //
    }
    //Phương thức khởi tạo có đối số
    public NT(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    //GETTER
    public int getDate() {
        return date;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    //SETTER
    public void setDate(int date) {
        this.date = date;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    //toString
    @Override
    public String toString() {
        return date + "/" + month + "/" + year;
    }
    //Hàm nhập vào ngày, tháng, năm
    public void nhap() {
        System.out.print("Ngày: ");
        date = sn.nextInt();
        System.out.print("Tháng: ");
        month = sn.nextInt();
        System.out.print("Năm: ");
        year = sn.nextInt();
    }
}
