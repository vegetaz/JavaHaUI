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
public class SVCDN extends Nguoi {

    private float TDKT; //Tổng điểm các môn kiểm tra
    private int SMKT; //Số môn kiểm tra

    public SVCDN() {
    }

    public SVCDN(float TDKT, int SMKT, String hoTen, String ngaySinh, String diaChi, int loaiSV) {
        super(hoTen, ngaySinh, diaChi, loaiSV);
        this.TDKT = TDKT;
        this.SMKT = SMKT;
    }

    public float getTDKT() {
        return TDKT;
    }

    public int getSMKT() {
        return SMKT;
    }

    public void setTDKT(float TDKT) {
        this.TDKT = TDKT;
    }

    public void setSMKT(int SMKT) {
        this.SMKT = SMKT;
    }

    @Override
    public float tinhDiem() {
        float DTB = 0;
        DTB = (float) TDKT / SMKT;
        return DTB;
    }

}
