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
public class Nguoi {
    private String name;
    private ThangNam dob;
    //Constructor
    public Nguoi() {
        //
    }
    //Constructors
    public Nguoi(String name, ThangNam dob) {
        this.name = name;
        this.dob = dob;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setDob(ThangNam dob) {
        this.dob = dob;
    }
    //getter
    public String getName() {
        return name;
    }
    public ThangNam getDob() {
        return dob;
    }
    //Input
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Name: ");
        name = sn.nextLine();
        System.out.println("Date of birth");
        dob = new ThangNam();
        dob.nhap();
    }
    //Output Title
    public static void xuatTD() {
        System.out.printf("%25s%25s\n", "Name", "Date of birth");
    }
    //Output
    public void xuat() {
        System.out.printf("%25s%25s\n", name, dob);
    }
}
