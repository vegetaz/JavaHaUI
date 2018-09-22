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
public class SinhVien extends Nguoi {
    private String lop;
    private String nganh;
    private Truong truong;

    public SinhVien() {
    }

    public SinhVien(String lop, String nganh, Truong truong, String name, int age, char gender) {
        super(name, age, gender);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    public String getLop() {
        return lop;
    }

    public String getNganh() {
        return nganh;
    }

    public Truong getTruong() {
        return truong;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    @Override
    public String toString() {
        return "Thông tin sinh viên:" + "\n\tTên: " + super.getName() + 
                "\n\tTuổi: " + super.getAge() + "\n\tGiới tính: " + 
                super.getGender() + "\n\tLớp: " + lop + 
                "\n\tNgành: " + nganh + "\n\tThông tin trường: " + truong;
    }
    
    
}
