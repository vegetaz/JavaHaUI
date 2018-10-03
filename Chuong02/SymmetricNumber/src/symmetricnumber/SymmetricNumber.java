/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symmetricnumber;
import java.util.Scanner;
/**
 *
 * @author veget
 */
public class SymmetricNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num; //Số ban đầu
        int reverse = 0; //Số đảo ngược
        int temp;
        
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhập vào số đối xứng: ");
        num = sn.nextInt();
        temp = num;
        
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10; // temp = temp / 10;
        }
        
        if (reverse == num) {
            System.out.println("Số " + num + " là số đối xứng!");
        }
        else
            System.out.println("Số " + num + " không là số đối xứng!");
    }
    
}
