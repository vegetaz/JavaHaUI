/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai05;

/**
 *
 * @author veget
 */
public class Bai05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        Truong tr = new Truong();
        sv.setName("Đào Thị Mỹ Linh");
        sv.setAge(19);
        sv.setGender('F');
        sv.setLop("Ngôn ngữ Anh");
        sv.setNganh("Tiếng Anh");
        tr.setTen("Đại Học Hà Nội");
        tr.setDiaChi("gần mặt đường");
        tr.setHieuTruong("Không biết!");
        sv.setTruong(tr);
        System.out.println(sv);
    }
    
}
