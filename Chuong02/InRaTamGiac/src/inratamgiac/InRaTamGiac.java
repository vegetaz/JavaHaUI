/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inratamgiac;

import java.util.Scanner;

/**
 *
 * @author veget
 */
public class InRaTamGiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        n = sn.nextInt();
        for (int i = 1; i<= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
