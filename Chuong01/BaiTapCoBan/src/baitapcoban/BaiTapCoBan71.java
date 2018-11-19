/* Nhập vào một số nguyên n và một số thực x
 * Tính và in ra kết quả sau:
 * S = ((x^2) + 1)^n
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz (Nguyễn Văn Vận)
 */
public class BaiTapCoBan71 {
    
    public double tinhS(int n, double x) {
        double t = Math.pow(x, 2) + 1;
        double s = Math.pow(t, n);
        return s;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số nguyên n: ");
        int n = sc.nextInt();
        System.out.print("Số thực x: ");
        double x = sc.nextDouble();
        BaiTapCoBan71 btcb71 = new BaiTapCoBan71();
        System.out.println("Giá trị của biểu thức là: " + btcb71.tinhS(n, x));
    }
}
