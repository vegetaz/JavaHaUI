/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Kiểm tra một số có phải số hoàn hảo hay không?
 * Số hoàn hảo là số có tổng các ước số bằng chính nó. Ví dự 1 + 2 + 3 = 6.
 */
package perfectnumber;
import java.util.Scanner;
/**
 *
 * @author veget
 */
public class PerfectNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        int num;
        int sum = 0;
        
        System.out.print("Nhập vào số nguyên: ");
        num = sn.nextInt();
        
        while (num < 0) {
            System.out.println("Phải là số nguyên dương!");
            System.out.print("Mời nhập lại: ");
            num = sn.nextInt();
        }

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum+= i;
            }
        }
        
        if (num == sum) {
            System.out.printf("Số %d là số hoàn hảo!\n", num);
        }
        else
            System.out.printf("Số %d không là số hoàn hảo!\n", num);
        
    }
    
}
