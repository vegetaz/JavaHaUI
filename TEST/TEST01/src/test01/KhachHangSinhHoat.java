package test01;
/**
 *
 * @author veget
 */
public class KhachHangSinhHoat extends KhachHang {

    int soDienTieuThu;
    final int BASE = 50;
    final int RATE1 = 1000;
    final int RATE2 = 1500;
    final int RATE3 = 2000;
    double tienDien;
    private String gioiTinh;

    public KhachHangSinhHoat() {
        //
    }

    public KhachHangSinhHoat(String maKhachHang, String tenKhachHang,
            String diaChi, int soDienThoai, int chiSoDau, int chiSoCuoi,
            String gioiTinh) {
        super(maKhachHang, tenKhachHang, diaChi, soDienThoai, chiSoDau, chiSoCuoi);
        this.gioiTinh = gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public double tienDien() {
        soDienTieuThu = getChiSoCuoi() - getChiSoDau();
        if (soDienTieuThu > 0 && soDienTieuThu <= 50) {
            tienDien = soDienTieuThu * RATE1;
        } else if (soDienTieuThu <= 100) {
            tienDien = BASE * RATE1 + (soDienTieuThu - BASE) * RATE2;
        } else {
            tienDien = BASE * RATE1 + BASE * RATE2 + (soDienTieuThu - 2 * BASE) * RATE3;
        }
        return tienDien;
    }

}
