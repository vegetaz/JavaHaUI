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
public class KySu extends CanBo {

    private String nganhDaoTao;

    public KySu() {
        //Hàm khởi tạo không đối số
    }

    public KySu(String hoTen, int namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }
}
