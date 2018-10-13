/*
- Mã khách hàng
- Tên khách hàng
- Địa chỉ khách hàng
- Số điện thoại khách hàng
- Chỉ số đầu tháng
- Chỉ số cuối tháng
 */
package test01;

/**
 *
 * @author veget
 */
public abstract class KhachHang {

    private String maKhachHang;
    private String tenKhachHang;
    private String diaChi;
    private int soDienThoai;
    private int chiSoDau;
    private int chiSoCuoi;

    public KhachHang() {
        //
    }

    public KhachHang(String maKhachHang, String tenKhachHang, String diaChi,
            int soDienThoai, int chiSoDau, int chiSoCuoi) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setChiSoDau(int chiSoDau) {
        this.chiSoDau = chiSoDau;
    }

    public void setChiSoCuoi(int chiSoCuoi) {
        this.chiSoCuoi = chiSoCuoi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public int getChiSoDau() {
        return chiSoDau;
    }

    public int getChiSoCuoi() {
        return chiSoCuoi;
    }

    public abstract double tienDien();
}
