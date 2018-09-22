/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai03;

/**
 *
 * @author veget
 */
public class NhanVien {
    private String name;
    private DiaChi address;
    private String dob;
    private char gender;

    public NhanVien() {
    }

    public NhanVien(String name, DiaChi address, String dob, char gender) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public DiaChi getAddress() {
        return address;
    }

    public String getDob() {
        return dob;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(DiaChi address) {
        this.address = address;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Thông tin nhân viên" + "\nHọ tên: " + name + "\nĐịa chỉ: " + address + "\nNgày sinh: " + dob + "\nGiới tính: " + gender;
    }
    
}
