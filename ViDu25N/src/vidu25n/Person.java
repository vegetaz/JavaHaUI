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
public class Person {
    private String name;
    private Times dob;
    //Constructor không đối số
    public Person() {
        //
    }
    public Person(String name, Times dob) {
        this.name = name;
        this.dob = dob;
    }
    //getter
    public String getName() {
        return name;
    }
    public Times getDob() {
        return dob;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setDob(Times dob) {
        this.dob = dob;
    }
    //Nhập
    void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập vào Họ tên: ");
        name = sn.nextLine();
        dob = new Times();
        System.out.println("Nhập vào ngày sinh: ");
        dob.nhap();
    }
    //Xuất
    void xuat() {
        System.out.println("Thông tin cá nhân");
        System.out.println("Họ và tên: " + name);
        System.out.println(dob);
    }
}
