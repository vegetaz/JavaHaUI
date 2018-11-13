/* Số điện sử dụng          Giá bán điện
        0 - 50                  1388
        51 - 100                1433
        101 - 200               1600
        201 - 300               2082
        301 - 400               2324
        401++                   2399
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int BASE = 50;
        int RATE0 = 1388;
        int RATE1 = 1433;
        int RATE2 = 1600;
        int RATE3 = 2082;
        int RATE4 = 2324;
        int RATE5 = 2399;
        int soDien;
        double thanhTien;
        //
        System.out.print("Số điện tiêu thụ: ");
        soDien = sc.nextInt();
        //
        if (0 < soDien && soDien <= 50) {
            thanhTien = RATE0 * soDien;
            System.out.println("Số tiền phải trả là: " + thanhTien);
        } else if (50 < soDien && soDien <= 100) {
            thanhTien = (RATE0 * BASE) + ((soDien - BASE) * RATE1);
            System.out.println("Số tiền phải trả là: " + thanhTien);
        } else if (100 < soDien && soDien <= 200) {
            thanhTien = (BASE * RATE0) + (BASE * RATE1)
                    + ((soDien - (BASE + BASE)) * RATE2);
            System.out.println("Số tiền phải trả là: " + thanhTien);
        } else if (200 < soDien && soDien <= 300) {
            thanhTien = (BASE * RATE0) + (BASE * RATE1)
                    + (((BASE + BASE)) * RATE2)
                    + ((soDien - (BASE + BASE + BASE + BASE)) * RATE3);
            System.out.println("Số tiền phải trả là: " + thanhTien);
        } else if (300 < soDien && soDien <= 400) {
            thanhTien = (BASE * RATE0) + (BASE * RATE1)
                    + (((BASE + BASE)) * RATE2)
                    + (((BASE + BASE + BASE + BASE)) * RATE3)
                    + ((soDien - (BASE + BASE + BASE + BASE + BASE + BASE)) * RATE4);
            System.out.println("Số tiền phải trả là: " + thanhTien);
        } else if (400 < soDien) {
            thanhTien = (BASE * RATE0) + (BASE * RATE1)
                    + (((BASE + BASE)) * RATE2)
                    + (((BASE + BASE + BASE + BASE)) * RATE3)
                    + (((BASE + BASE + BASE + BASE + BASE + BASE)) * RATE4)
                    + ((soDien - (BASE + BASE + BASE + BASE + BASE + BASE + BASE + BASE)) * RATE5);
            System.out.println("Số tiền phải trả là: " + thanhTien);
        } else {
            System.out.println("Số điện không hợp lệ!");
        }
    }
}
