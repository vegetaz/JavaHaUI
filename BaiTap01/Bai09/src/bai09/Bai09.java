/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai09;

import java.util.Scanner;

/**
 *
 * @author veget
 */
public class Bai09 {

    /**
     * @param args the command line arguments
     */
    Shape a[];

    public Bai09(int n) {
        a = new Shape[n];
    }
    Scanner sn = new Scanner(System.in);

    public void nhap() {
        for (int i = 0; i < a.length; i++) {
            System.out.print("1. Rectangle, 2. Triangle: ");
            int choice = sn.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("length: ");
                    int cd = sn.nextInt();
                    System.out.print("width: ");
                    int cr = sn.nextInt();
                    sn.nextLine();
                    a[i] = new Rectangle(cd, cr, "Rectangle");
                    break;
                case 2:
                    System.out.print("base: ");
                    int d = sn.nextInt();
                    System.out.print("height: ");
                    int cc = sn.nextInt();
                    sn.nextLine();
                    a[i] = new Triangle(d, cc, "Triangle");
                    break;
            }
        }
    }

    public void xuat() {
        System.out.println("Rectangle");
        //System.out.printf("%15s%15s%15s", "length", "width", "area");
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Rectangle) {
                //System.out.printf("\n%15s", /*a[i].getLength(), a[i].getWidth(),*/ a[i].getArea());
                System.out.println("Area of " + (i + 1) + " is: " + a[i].getArea());
            }
        }
        System.out.println("Triangle");
        //System.out.printf("%15s%15s%15s", "base", "height", "area");
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Triangle) {
                //System.out.printf("\n%15s", /*a[i].getBase(), a[i].getHeight(),*/ a[i].getArea());
                System.out.println("Area of " + (i + 1) + " is: " + a[i].getArea());
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Number of Shape: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        Bai09 b9 = new Bai09(m);
        b9.nhap();
        b9.xuat();
    }

}
