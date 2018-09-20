/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;

/**
 *
 * @author nghien
 */
public class ClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Person p = new Person("Nguyễn Tấn Dũng","22.12.1948","Nam","Cần Thơ");
       Person p1 = new Person("abc","abc","abc","abc");
       /*p.setId(100);
       p.setName("Nguyễn Tấn Dũng");
       p.setDob("22.12.1948");
       p.setAddress("Cần Thơ");
       p.setGender("Nam");*/
        System.out.println("Thông tin cua ngươi thứ nhất:"+p);
        System.out.println("Thông tin cua nguoi thu hai:"+p1);
        System.out.println("Gia tri hien tai cua idnumber la:"+Person.getIdNumber());
    }
    
}
