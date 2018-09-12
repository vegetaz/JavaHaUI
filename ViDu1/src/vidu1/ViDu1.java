/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidu1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author nghien
 */
public class ViDu1 {

    int a;
    static int b;

    public int tinhtoan(int x, int y) {

        return x + y;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViDu1 v = new ViDu1();
        DecimalFormat df = new DecimalFormat("0.00");
        double x = 1.0 / 3;
        System.out.println("Giá trị không định dạng:" + x);
        System.out.println("Giá trị có định dạng:" + df.format(x));
        // System.out.println("Hello world");
        Scanner sc = new Scanner(System.in);
        int i;
        float f;
        double d;
        char c;
        String s;
        System.out.print("Mời nhập một số nguyên:");
        i = sc.nextInt();
        System.out.print("Mời nhập một số thực float:");
        f = sc.nextFloat();
        System.out.print("Mời nhập một số thực double");
        d = sc.nextDouble();
        sc.nextLine();//xóa bộ đệm
        System.out.print("Mời nhập một chuỗi kí tự:");
        s = sc.nextLine();
        System.out.print("Mời nhập một kí tự:");
        c = sc.nextLine().charAt(0);
        System.out.println("Số nguyên vừa nhập là:" + i);
        System.out.println("Số thực float vừa nhập là:" + f);
        System.out.println("Số thực double vừa nhập là:" + d);
        System.out.println("Chuỗi vừa nhập là:" + s);
        System.out.println("Kí tự vừa nhập là:"+c);
    }

}
