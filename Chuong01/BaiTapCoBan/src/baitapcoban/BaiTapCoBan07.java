/*
 * Nhập vào một số nguyên x
 * Tính tổng và in ra S = 1 + x + (x^3)/3 + (x^5)/5
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("X = ");
        x = sc.nextInt();
        double s = 1 + x + ((double) (x * x * x) / 3) + ((double) (x * x * x * x * x) / 5);
        System.out.println("S = " + s);
    }

}
