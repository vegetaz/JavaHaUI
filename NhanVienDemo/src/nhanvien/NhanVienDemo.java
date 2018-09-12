/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanvien;

/**
 *
 * @author nghien
 */
public class NhanVienDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NhanVien nv[] = new NhanVien[2];//tao mang nv co 2 nhan vien
       for(int i=0;i<nv.length;i++){
           nv[i] = new NhanVien();
           nv[i].nhap();//goi nhap de nhap thong tin nhan vien
       }
       //in ra màn hình
        System.out.println("Sanh sach nhan vien sau khi nhap");
        //in tieu de
        NhanVien.xuatTieuDe();
        for(int i=0;i<nv.length;i++){
            nv[i].xuat();
        }
    }
    
}
