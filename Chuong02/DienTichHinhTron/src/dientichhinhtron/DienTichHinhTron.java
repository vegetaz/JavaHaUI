/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dientichhinhtron;
import java.util.Scanner;
/**
 *
 * @author veget
 */
public class DienTichHinhTron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        float r;
        double dt;
        
        System.out.print("Bán kính hình tròn: ");
        r = sn.nextFloat();
        if ( r >= 0) {
            dt = Math.pow(r, 2) * Math.PI;
            System.out.println("Diện tích hình tròn bán kính r = " + r + " là " + dt);
        }
        else
            System.out.println("Bán kính hình tròn không phù hợp!");
        
    }
    
}
