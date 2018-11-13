/* Tính tiền Resort
    Tên loại phòng          Giá 1 đêm       Giá 2 - 3 đêm       Giá 4 đêm trở lên
1   Standard                1260000         945000              880000
2   Superior Garden View    1550000         1160000             1085000
3   Superior Ocean View     1830000         1370000             1280000
4   Garden View Bungalow    1830000         1370000             1280000
5   Pool View Bungalow      2120000         1590000             1480000
6   Family Room             2120000         1590000             1480000
7   Beach Front Bungalow    2540000         1900000             1780000
8   VIP Sea View            4800000         3600000             3300000
 */
package baitapcoban;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loaiPhong;
        int soDem;
        int RATE11 = 1260000;
        int RATE21 = 945000;
        int RATE31 = 880000;
        int thanhTien;
        do {
            System.out.println("Danh sách loại phòng");
            System.out.println("1. Standard");
            System.out.println("2. Superior Garden View");
            System.out.println("3. Superior Ocean View");
            System.out.println("4. Garden View Bungalow");
            System.out.println("5. Pool View Bungalow");
            System.out.println("6. Family Room");
            System.out.println("7. Beach Front Bungalow");
            System.out.println("8. VIP Sea View");
            System.out.println("9. Thoát");
            System.out.print("Chọn: ");
            loaiPhong = sc.nextInt();
            switch (loaiPhong) {
                case 1:
                    System.out.println("Đã chọn Standard");
                    System.out.print("Nhập số đêm đã ở: ");
                    soDem = sc.nextInt();
                    if (soDem == 1) {
                        thanhTien = soDem * RATE11;
                        System.out.println("Số tiền phải trả là: " + thanhTien);
                    } else if (soDem == 2 || soDem == 3) {
                        thanhTien = soDem * RATE21;
                        System.out.println("Số tiền phải trả là: " + thanhTien);
                    } else if (4 <= soDem) {
                        thanhTien = soDem * RATE31;
                        System.out.println("Số tiền phải trả là: " + thanhTien);
                    } else {
                        System.out.println("Số đêm đã ở không đúng!");
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    System.out.println("Thoát!");
                    break;
                default:
                    System.out.println("Lựa chọn không đúng!");
                    break;
            }
        } while (loaiPhong != 9);
    }
}
