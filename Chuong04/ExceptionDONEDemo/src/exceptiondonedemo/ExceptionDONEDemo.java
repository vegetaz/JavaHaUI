/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondonedemo;

import java.util.Scanner;

/**
 *
 * @author veget
 */
public class ExceptionDONEDemo {

    /**
     * @param args the command line arguments
     */
    public static String nhapChuoi() throws StringTooLongException {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi ký tự: ");
        String s = sn.nextLine();
        int sl = s.length();
        if (sl > 20) {
            throw new StringTooLongException("Chuỗi bạn nhập nhiều hơn 20 ký tự!");
        }
        return s;
    }

    public static void main(String[] args) {
        String s = null;
        do {
            try {
                s = ExceptionDONEDemo.nhapChuoi();
                System.out.println("Chuỗi vừa nhập: " + s);
            } catch (StringTooLongException e) {
                System.out.println(e.getMessage());
            }
        } while (!s.equals("DONE"));
    }

}
