/*
Một công ty điện lực
- Mã khách hàng
- Tên khách hàng
- Địa chỉ khách hàng
- Số điện thoại khách hàng
- Chỉ số đầu tháng
- Chỉ số cuối tháng
Tiền điện phải trả tuỳ thuộc vào từng loại khách hàng như sau:
- Đối với khách hàng điện sinh hoạt thì 50 số đầu giá 1000 đồng/1 số, 50 số tiếp
theo là 1500 đồng/1 số, các số điện vượt quá 100 là 2000 đồng/1 số.
- Đối với khách hàng điện sản xuất thì đơn giá phụ thuộc vào loại hình sản xuất:
+ Sản xuất nhỏ: 1800 đồng/1 số
+ Sản xuất trung bình: 2300 đồng/1 số
+ Sản xuất lớn: 2500 đồng/1 số
Gợi ý: số điện tiêu thụ = chỉ số cuối - chỉ số đầu
Yêu cầu:
1. (4 điểm) Xây dựng lớp KhachHang chứa các thông tin chung cho cả 2 loại khách hàng.
2. (4 điểm) Xây dựng 2 lớp KhachHangSinhHoat và KhachHangSanXuat kế thừa từ lớp
KhachHang (bổ sung thêm thông tin nếu cần thiết).
3. (2 điểm) Xây dựng lớp Test thực hiện nhiệm vụ sau:
- Tạo một mảng các khách hàng (2 khách hàng điện sinh hoạt và 3 khách hàng điện
sản xuất ứng với 3 loại).
- Hiển thị thông tin danh sách mỗi loại khách hàng (2 danh sách riêng biệt cho
mỗi loại khách hàng).
 */
package test01;

import java.util.Scanner;

/**
 *
 * @author veget
 */
public class TEST01 {

    /**
     * @param args the command line arguments
     */
    KhachHang kh[];

    public TEST01(int n) {
        kh = new KhachHang[n];
    }
    Scanner sn = new Scanner(System.in);

    public void nhap() {
        for (int i = 0; i < kh.length; i++) {
            System.out.println("Khách hàng thứ " + (i + 1));
            System.out.print("Mã Khách Hàng: ");
            String maKhachHang = sn.nextLine();
            System.out.print("Tên Khách Hàng: ");
            String tenKhachHan = sn.nextLine();
            System.out.print("Địa Chỉ: ");
            String diaChi = sn.nextLine();
            System.out.print("Số Điện Thoại: ");
            int soDienThoai = sn.nextInt();
            System.out.print("Chỉ Số Đầu: ");
            int chiSoDau = sn.nextInt();
            System.out.print("Chỉ Số Cuối: ");
            int chiSoCuoi = sn.nextInt();
            sn.nextLine();
            System.out.println("1. Khách Hàng Sinh Hoạt");
            System.out.println("2. Khách Hàng Sản Xuất");
            System.out.print("Loại Khách Hàng?: ");
            int loaiKhachHang = sn.nextInt();
            sn.nextLine();
            switch (loaiKhachHang) {
                case 1:
                    kh[i] = new KhachHangSinhHoat(maKhachHang, tenKhachHan, diaChi, soDienThoai, chiSoDau, chiSoCuoi, diaChi);
                    break;
                case 2:
                    System.out.println("1. Sản Xuất Nhỏ");
                    System.out.println("1. Sản Xuất Trung Bình");
                    System.out.println("1. Sản Xuất Lớn");
                    System.out.print("Loại Hình Sản Xuất?: ");
                    int loaihinhSX = sn.nextInt();
                    sn.nextLine();
                    kh[i] = new KhachHangSanXuat(loaihinhSX, maKhachHang, tenKhachHan, diaChi, soDienThoai, chiSoDau, chiSoCuoi);
                    break;
            }
        }
    }

    public void xuat() {
        System.out.println("Danh sách khách hàng sinh hoạt");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s", "Mã Khách Hàng",
                "Tên Khách Hàng", "Địa Chỉ", "Số Điện Thoại", "Chỉ Số Đầu",
                "Chỉ Số Cuối", "Tổng Tiền");
        for (int i = 0; i < kh.length; i++) {
            if (kh[i] instanceof KhachHangSinhHoat) {
                System.out.printf("\n%-15s%-15s%-15s%-15s%-15s%-15s%-15s",
                        kh[i].getMaKhachHang(), kh[i].getTenKhachHang(),
                        kh[i].getDiaChi(), kh[i].getSoDienThoai(),
                        kh[i].getChiSoDau(), kh[i].getChiSoCuoi(), kh[i].tienDien());
            }
        }
        System.out.println("\n\nDanh sách khách hàng sản xuất");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s", "Mã Khách Hàng",
                "Tên Khách Hàng", "Địa Chỉ", "Số Điện Thoại", "Loại sản xuất",
                "Chỉ Số Đầu", "Chỉ Số Cuối", "Tổng Tiền");
        for (int i = 0; i < kh.length; i++) {
            if (kh[i] instanceof KhachHangSanXuat) {
                System.out.printf("\n%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s",
                        kh[i].getMaKhachHang(), kh[i].getTenKhachHang(),
                        kh[i].getDiaChi(), kh[i].getSoDienThoai(),
                        ((KhachHangSanXuat) kh[i]).getLoaihinhSX(),
                        kh[i].getChiSoDau(), kh[i].getChiSoCuoi(), kh[i].tienDien());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.print("Số Khách Hàng: ");
            n = sn.nextInt();
            sn.nextLine();
        }
        TEST01 baikt = new TEST01(n);
        baikt.nhap();
        baikt.xuat();
    }
}
