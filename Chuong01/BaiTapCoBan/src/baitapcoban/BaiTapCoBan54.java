/* Tính giá trị biểu thức
 * Nhập vào một số nguyên n, tính các biểu thức:
 * A = tổng các số lẻ nhỏ hơn hay bằng n
 * B = tổng các số chẵn nhỏ hơn hay bằng n
 * C = tích các số từ 1 tới n
 * D = tích các số chia hết cho 3 nhỏ hơn hay bằng n
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int A = 0;
        int B = 0;
        int C = 1;
        int D = 1;
        System.out.print("Nhập vào số nguyên n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                A = A + i;
            }
            if (i % 2 == 0) {
                B = B + i;
            }
            C = C * i;
            if (i % 3 == 0) {
                D = D * i;
            }
        }
        System.out.println("Tổng các số lẻ nhỏ hơn hay bằng n là: " + A);
        System.out.println("Tổng các số chẵn nhỏ hơn hay bằng n là: " + B);
        System.out.println("Tích các số từ 1 tới n là: " + C);
        System.out.println("Tích các số chia hết cho 3 nhỏ hơn hay bằng n là: " + D);
    }
}
