/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentineldemo;

import java.util.Scanner;

/**
 *
 * @author nghien
 */
public class SentinelDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Viết chương trình nhập vào các số nguyên và tính tổng các số nhập được
        //Kết thúc nhập khi gặp số 0
        int num = 0;
        int sum = 0;
        Scanner sn = new Scanner(System.in);
        do{
            System.out.print("Mời bạn nhập vào một số nguyên (nhập 0 thì dừng):");
            num = sn.nextInt();
            sum+=num;
        }
        while(num!=0);
        System.out.println("Tổng các số nguyên đã nhập là:"+sum);
                
        
    }
    
}
