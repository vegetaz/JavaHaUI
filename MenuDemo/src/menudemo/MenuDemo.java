/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menudemo;

import java.util.Scanner;

/**
 *
 * @author nghien
 */
public class MenuDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice = 0;
        int num1 = 0, num2 = 0;
        int result = 0;
        Scanner sn = new Scanner(System.in);
        do {
            //hiển thị menu
            System.out.println("1.Nhập 2 số nguyên");
            System.out.println("2.Tính tổng 2 số nguyên");
            System.out.println("3.Tính hiểu 2 số nguyên");
            System.out.println("4.Tính tích của 2 số nguyên");
            System.out.println("5.Tính thương của 2 số nguyên");
            System.out.println("6.Thoát khỏi chương trình");
            System.out.print("Mời quý vị nhập vào lựa chọn:");
            choice = sn.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Mời quý vị nhập số nguyên thứ nhất:");
                    num1 = sn.nextInt();
                    System.out.print("Mời quý vị nhập số nguyên thứ hai:");
                    num2 = sn.nextInt();
                    break;
                case 2:
                    result = num1 + num2;
                    System.out.printf("Tổng của %d và %d là %d\n", num1, num2, result);
                    break;
                case 3:
                    result = num1 - num2;
                    System.out.printf("Hiệu của %d và %d là %d\n", num1, num2, result);
                    break;
                case 4:
                    result = num1 * num2;
                    System.out.printf("Tích của %d và %d là %d\n", num1, num2, result);
                    break;
                case 5:
                    //kiem tra mau
                    if(num2==0){
                        System.out.println("Không chia được cho 0");
                    }
                    else{
                        //result = num1 / num2;
                        System.out.printf("Thương của %d và %d là %.2f\n", num1, num2, (double)num1/num2);
                    
                    }
                    break;
            }
        } while (choice != 6);
    }

}
