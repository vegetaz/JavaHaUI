/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception01;

import javax.swing.*;

/**
 *
 * @author veget
 */
public class Exception01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        try {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhập số nguyên: "));
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("Cần nhập vào số nguyên!");
        }
    }

}
