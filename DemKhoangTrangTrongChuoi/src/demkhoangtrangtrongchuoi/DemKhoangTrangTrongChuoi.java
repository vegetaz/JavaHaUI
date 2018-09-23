/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demkhoangtrangtrongchuoi;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class DemKhoangTrangTrongChuoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        char c;
        int n = 0;
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi ký tự: ");
        s = sn.nextLine();
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == ' ') {
                n++;
            }
        }
        System.out.println("Số khoảng trắng trong chuỗi " + "\"" + s + "\"" + " là: " + n);
    }

}
