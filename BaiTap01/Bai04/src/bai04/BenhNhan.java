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
public class BenhNhan extends Nguoi {
    private String tienSu;
    private String chanDoan;
    private BenhVien benhVien;

    public BenhNhan() {
    }

    public BenhNhan(String tienSu, String chanDoan, BenhVien benhVien, String name, int age, char gender) {
        super(name, age, gender);
        this.tienSu = tienSu;
        this.chanDoan = chanDoan;
        this.benhVien = benhVien;
    }

    public String getTienSu() {
        return tienSu;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }

    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }

    @Override
    public String toString() {
        return "Thông tin bệnh nhân" + "\n\tHọ tên: " + super.getName() + 
                "\n\tTuổi: " + super.getAge() + "\n\tGiới tính: " + 
                super.getGender() + "\n\tTiền sử: " + tienSu + 
                "\n\tChẩn đoán: " + chanDoan + 
                "\n\tThông tin bệnh viện: " + benhVien;
    }
    
    
}
