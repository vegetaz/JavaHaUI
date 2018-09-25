package tiendien;

import java.util.Scanner;

public class TienDien {

    public static void main(String[] args) {
        int sodien;
        final int BASE1 = 50;
        final int BASE2 = 100;
        final int BASE3 = 150;
        final double RATE1 = 1000;
        final double RATE2 = 1500;
        final double RATE3 = 2000;
        final double RATE4 = 3000;
        Scanner sn = new Scanner(System.in);
        System.out.print("Số điện tiêu thụ: ");
        sodien = sn.nextInt();
        double tongtien = 0d;
        if (sodien <= BASE1) {
            tongtien = sodien * RATE1;
        } else if (sodien <= BASE2) {
            tongtien = BASE1 * RATE1 + (sodien - BASE1) * RATE2;
        } else if (sodien <= BASE3) {
            tongtien = BASE1 * RATE1 + BASE1 * RATE2 + (sodien - 2 * BASE1) * RATE3;
        } else {
            tongtien = BASE1 * RATE1 + BASE1 * RATE2 + BASE1 * RATE3 + (sodien - 3 * BASE1) * RATE4;
        }
        System.out.println("Tổng tiền điện phải trả là: " + tongtien);
    }
}
