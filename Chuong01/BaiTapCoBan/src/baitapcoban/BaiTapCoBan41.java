/*
 * Nhập vào 4 số nguyên
 * Tìm số lớn nhất, số nhỏ nhất
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        //
        System.out.print("Nhập vào số thứ nhất a = ");
        a = sc.nextInt();
        System.out.print("Nhập vào số thứ nhất b = ");
        b = sc.nextInt();
        System.out.print("Nhập vào số thứ nhất c = ");
        c = sc.nextInt();
        System.out.print("Nhập vào số thứ nhất d = ");
        d = sc.nextInt();
        //
        int max = a;
        int min = a;
        //
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        //
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        //
        System.out.println("Giá trị nhỏ nhất là: " + min);
        System.out.println("Giá trị lớn nhất là: " + max);
    }
}
