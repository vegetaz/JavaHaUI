/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphymdemo;

/**
 *
 * @author nghien
 */
public class HangDienMay extends Hang{
    private int thoiGianBaoHanh;
    private int dienAp;
    private int congXuat;

    public HangDienMay(int thoiGianBaoHanh, int dienAp, int congXuat, String maHang, String tenHang, String nhaSanXuat, double gia) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congXuat = congXuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public int getDienAp() {
        return dienAp;
    }

    public int getCongXuat() {
        return congXuat;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public void setDienAp(int dienAp) {
        this.dienAp = dienAp;
    }

    public void setCongXuat(int congXuat) {
        this.congXuat = congXuat;
    }
    @Override
    public void nhap(){
        super.nhap();
        //nhap them cong xuat, dien ap, thoi gian bao hanh
        
    }
    public void xuat(){
        super.xuat();
        //in them cong xuat, dien ap, thoi gian bao hanh
    }
    
}
