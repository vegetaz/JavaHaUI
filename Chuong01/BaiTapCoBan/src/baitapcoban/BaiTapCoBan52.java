//Nhập vào một số nguyên n và một số thực x
// Tính A = (x^2 + x + 1)^n + (x^2 - x + 1)^n
package baitapcoban;

import java.util.Scanner;

public class BaiTapCoBan52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên n: ");
        int n = sc.nextInt();
        System.out.print("Nhập vào số thực x: ");
        float x = sc.nextFloat();
        double A;
        double A1 = 1;
        double A2 = 1;
        for (int i = 1; i <= n; i++) {
            A1 = A1 * (x * x + x + 1);
            A2 *= x * x - x + 1;
        }
        A = A1 + A2;
        System.out.println("Giá trị của biểu thức A là: " + A);
    }
}
