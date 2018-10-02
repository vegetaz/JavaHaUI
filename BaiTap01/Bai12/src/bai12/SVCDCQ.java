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
public class SVCDCQ extends Nguoi {//Sinh viên cao đẳng chính quy

    private float TDKT; //Tông điểm các môn kiểm tra
    private int SMKT; //Số môn kiểm tra
    private float DTKTHP; //Điểm thi kết thúc học phần

    public SVCDCQ() {
    }

    public SVCDCQ(float TDKT, int SMKT, float DTKTHP, String hoTen, String ngaySinh, String diaChi, int loaiSV) {
        super(hoTen, ngaySinh, diaChi, loaiSV);
        this.TDKT = TDKT;
        this.SMKT = SMKT;
        this.DTKTHP = DTKTHP;
    }

    public float getTDKT() {
        return TDKT;
    }

    public int getSMKT() {
        return SMKT;
    }

    public float getDTKTHP() {
        return DTKTHP;
    }

    public void setTDKT(float TDKT) {
        this.TDKT = TDKT;
    }

    public void setSMKT(int SMKT) {
        this.SMKT = SMKT;
    }

    public void setDTKTHP(float DTKTHP) {
        this.DTKTHP = DTKTHP;
    }

    @Override
    public float tinhDiem() {
        float DTB = 0;
        DTB = (float) ((TDKT / SMKT) + DTKTHP) / 3;
        return DTB;
    }

}
