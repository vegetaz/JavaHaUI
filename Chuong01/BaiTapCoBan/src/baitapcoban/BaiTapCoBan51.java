/*
 * Nhập vào một số nguyên n và một số thực x. Tính và in ra kết quả sau:
 * S = ((x^2) + 1)^n
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double s = 1;
        double x;
        System.out.print("n = ");
        n = sc.nextInt();
        System.out.print("x = ");
        x = sc.nextDouble();
        //
        if (n == 0) {
            System.out.println("S = " + s);
        } else if (0 < n) {
            for (int i = 0; i < n; i++) {
//                s = s * (x * x + 1);
                s *= x * x + 1;
            }
            System.out.println("S = " + s);
        } else {
            System.out.println("Méo");
        }
    }
}
