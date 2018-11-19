/* Sử dụng Math
 * Nhập vào một số nguyên n và một số thực x
 * Tính và in ra kết quả của biểu thức sau:
 * A = (x^2 + x + 1)^n + (x^2 - x + 1)^n
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz (Nguyễn Văn Vận)
 */
public class BaiTapCoBan57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số nguyên n: ");
        int n = sc.nextInt();
        System.out.print("Số thực n: ");
        double x = sc.nextDouble();
        double A1 = Math.pow(x, 2) + x + 1;
        double A2 = Math.pow(x, 2) - x + 1;
        double A = Math.pow(A1, n) + Math.pow(A2, n);
        System.out.println("Giá trị của biểu thức A = " + A);
    }
}
