/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai01;

/**
 *
 * @author veget
 */
public class Bai01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Đào Thị Mỹ Linh");
        p.setDob("06/07/1993");
        p.setPob("Cẩm Phả, Quảng Ninh");
        p.setGender('F');
        p.setEmail("mylinhhayan@annhieu.com");
        p.setPhone("19001060");
        System.out.println(p);
    }
    
}
