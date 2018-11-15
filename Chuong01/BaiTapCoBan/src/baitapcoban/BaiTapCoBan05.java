/*
 * Nhập vào một mảng hai chiều kiểu số thực từ bàn phím
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số dòng của mảng: ");
        int m = sc.nextInt();
        System.out.print("Nhập vào số cột của mảng: ");
        int n = sc.nextInt();
        float a[][] = new float[m][n];
        //Nhập vào giá trị cho các phần tử trong mảng
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("a[" + i + "]" + "[" + j + "]: ");
                a[i][j] = sc.nextFloat();
            }
        }
        //In ra các phần tử có trong mảng
        System.out.println("Danh sách các phần tử trong mảng:");
        //m = a.length
        //n = a[0].length
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
