/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai08;

import java.util.Scanner;

/**
 *
 * @author veget
 */
public class Bai08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Rectangle hcn = new Rectangle();
        hcn.setLength(5);
        hcn.setWidth(2);
        Triangle htg = new Triangle();
        htg.setBase(2);
        htg.setHeight(5);
        System.out.println(hcn);
        System.out.println(htg);
    }

}
