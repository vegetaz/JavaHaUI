/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * @author veget
 */
public class Bai12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        SVCDN sv1 = new SVCDN();
        sv1.setSMKT(12);
        sv1.setTDKT(79);
        sv1.nhapThongTin();
        sv1.tinhDiem();
        sv1.inThongTin();
        //
        SVCDCQ sv2 = new SVCDCQ();
        sv2.setDTKTHP((float) 7.5);
        sv2.setTDKT(96);
        sv2.setSMKT(12);
        sv2.nhapThongTin();
        sv2.tinhDiem();
        sv2.inThongTin();
    }

}
