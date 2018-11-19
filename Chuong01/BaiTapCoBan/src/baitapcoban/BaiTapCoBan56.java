/* Sử dụng Math
 * Nhập vào một số nguyên n và một số thực x
 * Tính và in ra kết quả sau:
 * S = ((x^2) + 1)^n
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz (Nguyễn Văn Vận)
 */
public class BaiTapCoBan56 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số nguyên n: ");
        int n = sc.nextInt();
        System.out.print("Số thực x: ");
        double x = sc.nextDouble();
        double t = Math.pow(x, 2) + 1;
        double S = Math.pow(t, n);
        System.out.println("Kết quả biểu thức S = " + S);
    }
}
