/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendien;

import java.util.Scanner;

/**
 *
 * @author nghien
 */
public class TienDien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sodien;
        final int BASE1 = 50;
        final int BASE2 = 100;
        final int BASE3 = 150;
        final double RATE1 = 1000;
        final double RATE2 = 1500;
        final double RATE3 = 2000;
        final double RATE4 = 3000;
        Scanner sn = new Scanner(System.in);
        System.out.print("Moi ban nhap so dien tieu thu:");
        sodien = sn.nextInt();
        double tongtien = 0;
        if(sodien<=BASE1){
            tongtien = sodien*RATE1;
        }
        else if(sodien<=BASE2){
            tongtien = BASE1*RATE1+(sodien-BASE1)*RATE2;
        }
        else if(sodien<=BASE3){
            tongtien = BASE1*RATE1+BASE1*RATE2+(sodien-2*BASE1)*RATE3;
        }
        else{
            tongtien = BASE1*RATE1+BASE1*RATE2+BASE1*RATE3+(sodien-3*BASE1)*RATE4;
        }
        System.out.println("Tổng tiền điện phải trả là: "+tongtien);
        
    }
    
}
