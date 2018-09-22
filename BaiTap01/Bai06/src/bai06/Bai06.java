/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai06;

/**
 *
 * @author veget
 */
public class Bai06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PartTimeEmployee pe = new PartTimeEmployee();
        pe.setName("Mèo Thị Sứt");
        pe.setDob("25/03/2018");
        pe.setAddress("Cẩm Phả, Quảng Ninh");
        pe.setGender("Đực Rựa");
        pe.setHoursPerWeek(40);
        System.out.println(pe);
    }
    
}
