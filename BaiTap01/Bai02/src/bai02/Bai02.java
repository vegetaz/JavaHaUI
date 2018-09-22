/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai02;

/**
 *
 * @author veget
 */
public class Bai02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiaChi address = new DiaChi();
        address.setThon("Thôn");
        address.setXa("Xã");
        address.setHuyen("Huyện");
        address.setTinh("Tỉnh");
        System.out.println(address);
    }
    
}
