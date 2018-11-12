/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapcoban;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c;

        System.out.println("a = 60");
        System.out.println("b = 13");
        System.out.println("");

        c = a & b;
//        Toán tử Và nhị phân sao chép một bit tới kết quả nếu nó tồn tại trong cả hai toán hạng
        System.out.println("a & b = " + c);

        c = a | b;
//        Toán tử Hoặc nhị phân sao chép một bit tới kết quả nếu nó tồn tại trong một hoặc hai toán hạng
        System.out.println("a | b = " + c);

        c = a ^ b;
//        Toán tử Hoặc loại trừ nhị phân sao chép bit nếu nó được thiết lập trong một toán hạng nhưng không phải trong cả hai
        System.out.println("a ^ b  = " + c);

        c = ~a;
//        Toán tử đảo bit là toán tử một ngôi. Đảo bít 1 thành 0 và ngược lại
        System.out.println("~ a = " + c);

        c = a << 2;
//        Toán tử dịch trái. Giá trị toán hạng trái được dịch chuyển sang trái bởi số các bit được xác định bởi toán hạng bên phải.
        System.out.println("a << 2 = " + c);

        c = a >> 2;
//        Toán tử dịch phải. Giá trị toán hạng trái được dịch chuyển sang phải bởi số các bit được xác định bởi toán hạng bên phải
        System.out.println("a >> 2 = " + c);

        c = a >>> 2;
//        Toán tử dịch phải và điền 0 vào chỗ trống
        System.out.println("a >>> 2 = " + c);
    }

}
