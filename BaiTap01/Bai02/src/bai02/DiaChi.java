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
public class DiaChi {
    private String thon;
    private String xa;
    private String huyen;
    private String tinh;

    public DiaChi() {
        //Hàm khởi tạo không đối số
    }

    public DiaChi(String thon, String xa, String huyen, String tinh) {
        this.thon = thon;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }

    public String getThon() {
        return thon;
    }

    public String getXa() {
        return xa;
    }

    public String getHuyen() {
        return huyen;
    }

    public String getTinh() {
        return tinh;
    }

    public void setThon(String thon) {
        this.thon = thon;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    @Override
    public String toString() {
        return "\nThôn: " + thon + "\nXã: " + xa + "\nHuyện: " + huyen + "\nTỉnh: " + tinh;
    }
    
    
}
