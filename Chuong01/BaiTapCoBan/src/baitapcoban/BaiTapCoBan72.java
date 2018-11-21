/* Xây dựng phương thức double tinhA(int n, double x) với n và x là tham số
 * truyền vào, phương thức có giá trị trả về là
 * A = (x^2 + x + 1)^n + (x^2 - x + 1)^n
 * kiểu trả về là double
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz (Nguyễn Văn Vận)
 */
public class BaiTapCoBan72 {
    public double tinhA(int n, double x) {
        double A1 = 1;
        double A2 = 1;
        double A;
        for (int i = 0; i < n; i++) {
            A1 = A1 * (x * x + x + 1);
            A2 = A2 * (x * x - x + 1);
        }
        A = A1 + A2;
        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("x = ");
        double x = sc.nextDouble();
        BaiTapCoBan72 btcb72 = new BaiTapCoBan72();
        System.out.println("A = " + btcb72.tinhA(n, x));
    }
}
