package test01;
/**
 *
 * @author veget
 */
public class KhachHangSanXuat extends KhachHang {
    private int loaihinhSX;
    //1. Sản xuất nhỏ
    //2. Sản xuất trung bình
    //3. Sản xuất lớn
    final int RATE1 = 1800;
    final int RATE2 = 2300;
    final int RATE3 = 2500;
    int soDienTieuThu;
    double tienDien;

    public KhachHangSanXuat() {
    }

    public KhachHangSanXuat(int loaihinhSX, String maKhachHang, String tenKhachHang, 
            String diaChi, int soDienThoai, int chiSoDau, int chiSoCuoi) {
        super(maKhachHang, tenKhachHang, diaChi, soDienThoai, chiSoDau, chiSoCuoi);
        this.loaihinhSX = loaihinhSX;
    }

    public int getLoaihinhSX() {
        return loaihinhSX;
    }

    public void setLoaihinhSX(int loaihinhSX) {
        this.loaihinhSX = loaihinhSX;
    }
    
    @Override
    public double tienDien() {
        soDienTieuThu = getChiSoCuoi() - getChiSoDau();
        switch (loaihinhSX) {
            case 1:
                tienDien = soDienTieuThu * RATE1;
                break;
            case 2:
                tienDien = soDienTieuThu * RATE2;
                break;
            case 3:
                tienDien = soDienTieuThu * RATE3;
                break;
        }
        return tienDien;
    }

}
