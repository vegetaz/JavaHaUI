/* Mảng 2 chiều
 * <Kiểu dữ liệu> <Tên Mảng>[][] = new <Kiểu dữ liệu>[m][n];
 * m: Số dòng được tính theo hàng ngang của mảng
 * n: Số cột được tính theo hàng dọc của mảng
 * Ví dụ:   int a[][] = new int[2][3];
 * Nếu trường hợp n không khai báo thì mảng có m phần tử và mỗi phần tử có thể
 * là một mảng
 */
package baitapcoban;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan04 {
    public static void main(String[] args) {
        int a[][] = new int[3][2];
        //a00 a01
        //a10 a11
        //a20 a21
        //dòng 1
        a[0][0] = 2;
        a[0][1] = 5;
        //dòng 2
        a[1][0] = 1;
        a[1][1] = 9;
        //dòng 3
        a[2][0] = 8;
        a[2][1] = 9;
        //
        System.out.println("Danh sách các phần tử trong mảng:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
