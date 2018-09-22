/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai04;

/**
 *
 * @author veget
 */
public class BenhVien {
    private String ten;
    private String diaChi;
    private String giamDoc;

    public BenhVien() {
    }

    public BenhVien(String ten, String diaChi, String giamDoc) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGiamDoc() {
        return giamDoc;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    @Override
    public String toString() {
        return "\n\t\tTên: " + ten + "\n\t\tĐịa chỉ: " + diaChi + 
                "\n\t\tGiám đốc: " + giamDoc;
    }
    
}
