/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatedemo;

import java.util.Scanner;

/**
 *
 * @author veget
 */
public class ValidateDemo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //validate có nghĩa là yêu cầu người sử dụng phải
        //nhập đúng dữ liệu theo mong muốn của người lập trình
        //Yêu cầu nhập vào tuổi của một người. age > 0
        
        int age;
        Scanner sn = new Scanner(System.in);
        System.out.print("Mời nhập vào tuổi: ");
        age = sn.nextInt();
        
        //age phải >0 và <=200
        //điều kiến đúng age>0 && age<=200
        while(age <= 0 || age > 200){
            System.out.println("Bạn phải nhập vào tuổi người > 0 và tuổi <= 200");
            System.out.print("Mời nhập lại tuổi: ");
            age = sn.nextInt();
        }
        System.out.println("Tuổi bạn vừa nhập là: " + age);
        
    }
    
}