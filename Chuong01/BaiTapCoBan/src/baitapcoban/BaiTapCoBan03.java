/*
 * Khai báo một mảng số thực gồm n phần tử nhập từ bàn phím và in ra màn hình
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử của mảng: ");
        int n = sc.nextInt();
        float a[] = new float[n];
        System.out.println("Nhập giá trị cho các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i +"]: ");
            a[i] = sc.nextFloat();
        }
        int l = a.length;
        System.out.println("Các phần tử trong mảng:");
        for (int i = 0; i < l; i++) {
            System.out.println("a[" + i + "]: " + a[i]);
        }
    }
}
