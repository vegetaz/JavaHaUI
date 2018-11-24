/* Nhận dạng tam giác
 * Nhập vào 3 cạnh a, b, c. Kiểm tra độ dài 3 cạnh có hợp thành một tam giác?
 * Nếu là tam giác thì đó là tam giác gì?
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz (Nguyễn Văn Vận)
 */
public class BaiTapCoBan73 {
    public void tamGiac() {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        float a = sc.nextFloat();
        System.out.print("b = ");
        float b = sc.nextFloat();
        System.out.print("c = ");
        float c = sc.nextFloat();
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Đây là tam giác!");
            if (a == b && b == c && c == a) {
                System.out.println("Tam giác đều");
            } else if (a == b || b == c || c == a) {
                System.out.println("Tam giác cân");
            } else {
                System.out.println("Tam giác thường");
            }
        } else {
            System.out.println("Đây không là tam giác!");
        }
    }
    
    public static void main (String[] args) {
        BaiTapCoBan73 btcb73 = new BaiTapCoBan73();
        btcb73.tamGiac();
    }
}
