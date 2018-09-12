/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author nghien
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nhập vào một số nguyên, kiểm tra xem nó có phải là số nguyên tố không
        //Số nguyên tố là số chia hết cho 1 và chính nó => Số nguyên tố là số 
        //không chia hết cho bất kì số nào từ 2 đến nó trừ đi 1
        int num;
        boolean flag = false;
        Scanner sn = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào một số nguyên:");
        num = sn.nextInt();
        for(int i = 2;i<num;i++){
            if(num%i==0){
                flag = true;
                break;
            }
        }
        if(flag==true){
            System.out.printf("Số %d không phải là số nguyên tố\n",num);
        }
        else{
            System.out.printf("Số %d là số nguyên tố\n",num);
        }
    }
    
}
