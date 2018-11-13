/* Tính cước taxi
 * 4 chỗ:
        Giá mở cửa:     11.000 đồng/800m
        <= 30 Km           16.500 đồng/km
        > 30 Km         12.400 đồng/km
 * 7 chỗ:
        Giá mở cửa:     11.000 đồng/800m
        <= 30 Km           17.500 đồng/km
        > 30 Km         14.400 đồng/km
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loaiXe;
        double soKm;
        double thanhTien;
        int BASE = 11000;
        int RATE11 = 16500;
        int RATE12 = 12400;
        int RATE21 = 17500;
        int RATE22 = 14400;
        System.out.println("Loại xe:");
        System.out.println("\t4. Xe 4 chỗ");
        System.out.println("\t7. Xe 7 chỗ");
        System.out.print("Chọn: ");
        loaiXe = sc.nextInt();
        switch (loaiXe) {
            case 4:
                System.out.print("Mời nhập số Km đã đi: ");
                soKm = sc.nextDouble();
                if (0 < soKm && soKm <= 0.8) {
                    thanhTien = BASE;
                    System.out.println("Số tiền phải trả là: " + thanhTien);
                } else if (0 < soKm && soKm <= 30) {
                    thanhTien = RATE11 * soKm;
                    System.out.println("Số tiền phải trả là: " + thanhTien);
                } else if (30 < soKm) {
                    thanhTien = RATE12 * soKm;
                    System.out.println("Số tiền phải trả là: " + thanhTien);
                } else {
                    System.out.println("Số Km nhập không đúng!");
                }
                break;
            case 7:
                System.out.print("Mời nhập số Km đã đi: ");
                soKm = sc.nextDouble();
                if (0 < soKm && soKm <= 0.8) {
                    thanhTien = BASE;
                    System.out.println("Số tiền phải trả là: " + thanhTien);
                } else if (0 < soKm && soKm <= 30) {
                    thanhTien = RATE21 * soKm;
                    System.out.println("Số tiền phải trả là: " + thanhTien);
                } else if (30 < soKm) {
                    thanhTien = RATE22 * soKm;
                    System.out.println("Số tiền phải trả là: " + thanhTien);
                } else {
                    System.out.println("Số Km nhập không đúng!");
                }
                break;
            default:
                System.out.println("Không có loại xe này!");
                break;
        }
    }
}
