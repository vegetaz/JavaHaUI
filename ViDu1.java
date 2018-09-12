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
        System.out.print("Moi nhap mot so nguyen: ");
        i = sc.nextInt();
        System.out.print("Moi nhap mot so thuc float: ");
        f = sc.nextFloat();
        System.out.print("Moi nhap mot so thuc double: ");
        d = sc.nextDouble();
        sc.nextLine();//xóa bộ đệm
        System.out.print("Moi nhap mot chuoi ky tu: ");
        s = sc.nextLine();
        System.out.print("Ky tu: ");
        c = sc.nextLine().charAt(0);
        System.out.println("So nguyen vua nhap la: " + i);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);
        System.out.println("Character: "+c);
    }

}
