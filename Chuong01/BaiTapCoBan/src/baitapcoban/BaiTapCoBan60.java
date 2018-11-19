/* Số lớn, số bé
 * Nhập vào a và b. So sánh a và b sau đó in ra kết quả số lớn hơn và số nhỏ hơn
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz (Nguyễn Văn Vận)
 */
public class BaiTapCoBan60 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Số nguyên b: ");
        int b = sc.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);
    }
}
