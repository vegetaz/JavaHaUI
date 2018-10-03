/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dientichhcn;

import java.util.Scanner;

/**
 *
 * @author veget
 */
public class DienTichHCN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float chieudai;
        float chieurong;
        Scanner sn = new Scanner(System.in);
        System.out.print("Chiều rộng: ");
        chieurong = sn.nextFloat();
        System.out.print("Chiều dài: ");
        chieudai = sn.nextFloat();
        HinhChuNhat hcn = new HinhChuNhat(chieurong, chieudai);
        System.out.println("Thông tin hình chữ nhật đã nhập!");
        System.out.println(hcn);
        
    }    

}
