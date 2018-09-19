/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidu27;
import java.util.Scanner;
/**
 *
 * @author veget
 */
public class ViDu27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n;
        Nguoi listN[];
        System.out.print("Number of people: ");
        n = sn.nextInt();
        listN = new Nguoi[n];
        for (int i = 0; i < n; i++) {
            listN[i] = new Nguoi();
            listN[i].nhap();
        }
        System.out.println("The information");
        Nguoi.xuatTD();
        for (int i = 0; i < n; i++) {
            listN[i].xuat();
        }
    }
    
}
