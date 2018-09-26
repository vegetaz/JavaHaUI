/* Cho ma trận số nguyên cấp n x m. Cài đặt các hàm thực hiện các chức năng sau:
 * a) Nhập ma trận.
 * b) In ma trận.
 * c) Tìm phần tử nhỏ nhất.
 * d) Tìm phần tử lẻ nhỏ nhất.
 * e) Tìm dòng có tổng lớn nhất.
 */
package matran;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class MaTran {

    /**
     * @param args the command line arguments
     */
    static int n, m, matrix[][];

    public static void nhapmatrix() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Số hàng của ma trận: ");
        n = sn.nextInt();
        System.out.print("Số cột của ma trận: ");
        m = sn.nextInt();
        matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("\ta[" + (i + 1) + ", " + (j + 1) + "] = ");
                matrix[i][j] = sn.nextInt();
            }
            System.out.println();
        }
    }

    public static void xuatmatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static int minmatrix() {
        int min = matrix[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public static int minle() {
        int minle = 1000;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((matrix[i][j] < minle) && (matrix[i][j] % 2 == 1)) {
                    minle = matrix[i][j];
                }
            }
        }
        return minle;
    }

    public static int tongdong(int row) {
        int tong = 0;
        for (int i = 0; i < m; i++) {
            tong += matrix[row][i];
        }
        return tong;
    }

    public static void main(String[] args) {
        int max = tongdong(0), chiso = 0;
        nhapmatrix();
        xuatmatrix(); //In ra ma trận
        System.out.println("Phần tử nhỏ nhất: " + minmatrix());
        System.out.println("Phần tử lẻ nhỏ nhất: " + minle());
        for (int i = 0; i < n; i++) {
            if (max < tongdong(i)) {
                max = tongdong(i);
                chiso = i;
            }
        }
        System.out.println("Dòng có tổng lớn nhất là dòng " + (chiso + 1)+ " và có giá trị là: " + max);
    }

}
