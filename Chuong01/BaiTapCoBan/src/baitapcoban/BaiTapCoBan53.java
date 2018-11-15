//Kiểm tra số nguyên tố
package baitapcoban;

import java.util.Scanner;

public class BaiTapCoBan53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        int x = sc.nextInt();
        int dem = 0;
        if (x <= 1) {
            System.out.println("Số " + x + " không là số nguyên tố!");
        } else {
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                System.out.println("Số " + x + " là số nguyên tố!");
            } else {
                System.out.println("Số " + x + " không là số nguyên tố!");
            }
        }
    }
}
