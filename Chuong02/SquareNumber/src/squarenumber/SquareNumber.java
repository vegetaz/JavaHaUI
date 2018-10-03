/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Kiểm tra một số có phải là số chính phương hay không
 */
package squarenumber;

import java.util.Scanner;

/**
 *
 * @author veget
 */
public class SquareNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        int n;
        int i;
        
        System.out.print("Nhập vào số nguyên dương: ");
        n = sn.nextInt();
        
        while (n < 0) {
            System.out.print("Nhập vào số nguyên dương: ");
            n = sn.nextInt();
        }
        
        i = (int)Math.sqrt(n);
        if (i * i == n) {
            System.out.printf("Số %d là số chính phương!\n", n);
        }
        else
            System.out.printf("Số %d không là số chính phương!\n", n);
    }
    
}
