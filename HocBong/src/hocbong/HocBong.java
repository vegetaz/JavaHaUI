/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocbong;

import java.util.Scanner;

/**
 *
 * @author nghien
 */
public class HocBong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float tbc;
       double hb = 0;
       final double SX = 240000;
       final double GIOI = 180000;
       final double KHA = 120000;
       Scanner sn = new Scanner(System.in);
        System.out.print("Mời bạn nhập điểm trung bình chung học kỳ:");
        tbc = sn.nextFloat();
        if(tbc>=3.5f){
            hb = SX;
        }
        else if(tbc>=3.0f){
            hb = GIOI;
        }
        else if(tbc>=2.5f){
            hb = KHA;
        }
        System.out.println("Học bổng của bạn là: "+hb);
    }
    
}
