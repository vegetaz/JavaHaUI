/* Đổi số thập phân sang nhị phân.
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author veget
 */
public class BaiTapCoBan55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String nhiPhan = "";
        System.out.print("Nhập vào số nguyên dương: ");
        n = sc.nextInt();
        while (1 < n) {
            nhiPhan = String.valueOf(n % 2) + nhiPhan;
            n = n / 2;
        }
        if (n == 1) {
            nhiPhan = "1" + nhiPhan;
        }
        if (n == 0) {
            nhiPhan = "0" + nhiPhan;
        }
        System.out.println("Số nhị phân là: " + nhiPhan);
    }
}
