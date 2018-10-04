/*
Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
Mỗi cán bộ cần quản lý lý các thuộc tính: Họ tên, năm sinh, giới tính, địa chỉ
+ Các công nhân cần quản lý: Bậc (công nhân bậc 3/7, bậc 4/7 ...)
+ Các kỹ sư cần quản lý: Ngành đào tạo
+ Các nhân viên phục vụ cần quản lý thông tin: công việc
1. Xây dựng các lớp NhanVien, CongNhan, KySu kế thừa từ lớp CanBo
2. Xây dựng các hàm để truy nhập, hiển thị thông tin và kiểm tra về các thuộc tính của các lớp.
3. Xây dựng lớp QLCB cài đặt các phương thức thực hiện các chức năng sau:
- Nhập thông tin mới cho cán bộ
- Tìm kiếm theo họ tên
- Hiển thị thông tin về danh sách các cán bộ
- Thoát khỏi chương trình.
 */
package bai02;

import java.util.Scanner;

/**
 *
 * @author veget
 */
public class Bai02 {

    CanBo canbo[];

    public Bai02(int n) {
        canbo = new CanBo[n];
    }
    Scanner sn = new Scanner(System.in);

    public void nhapTT() {
        for (int i = 0; i < canbo.length; i++) {
            System.out.print("Họ và tên: ");
            String hoTen = sn.nextLine();
            System.out.print("Năm sinh: ");
            int namSinh = sn.nextInt();
            sn.nextLine();
            System.out.print("Giới tính: ");
            String gioiTinh = sn.nextLine();
            System.out.print("Địa chỉ: ");
            String diaChi = sn.nextLine();
            System.out.print("1. Công Nhân, 2. Kỹ Sư, 3. Nhân Viên: ");
            int choice = sn.nextInt();
            sn.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Bậc của Công Nhân: ");
                    String bac = sn.nextLine();
                    canbo[i] = new CongNhan(hoTen, namSinh, gioiTinh, diaChi, bac);
                    break;
                case 2:
                    System.out.print("Ngành đào tạo của Kỹ Sư: ");
                    String nganhDaoTao = sn.nextLine();
                    canbo[i] = new KySu(hoTen, namSinh, gioiTinh, diaChi, nganhDaoTao);
                    break;
                case 3:
                    System.out.print("Công việc của Nhân Viên: ");
                    String congViec = sn.nextLine();
                    canbo[i] = new NhanVien(hoTen, namSinh, gioiTinh, diaChi, congViec);
                    break;
                default:
                    System.out.println("Lựa chọn không đúng!");
            }
        }
    }

    public void xuatTT() {
        System.out.println("Thông tin cán bộ");
        System.out.println("Thông tin công nhân");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Họ tên", "Năm sinh",
                "Giới tính", "Địa chỉ", "Bậc");
        for (int i = 0; i < canbo.length; i++) {
            if (canbo[i] instanceof CongNhan) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", canbo[i].getHoTen(),
                        canbo[i].getNamSinh(), canbo[i].getGioiTinh(),
                        canbo[i].getDiaChi(), ((CongNhan) canbo[i]).getBac());
            }
        }
        System.out.println("");
        System.out.println("Thông tin Kỹ Sư");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Họ tên", "Năm sinh",
                "Giới tính", "Địa chỉ", "Ngành đào tạo");
        for (int i = 0; i < canbo.length; i++) {
            if (canbo[i] instanceof KySu) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", canbo[i].getHoTen(),
                        canbo[i].getNamSinh(), canbo[i].getGioiTinh(),
                        canbo[i].getDiaChi(), ((KySu) canbo[i]).getNganhDaoTao());
            }
        }
        System.out.println("");
        System.out.println("Thông tin Nhân Viên");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Họ tên", "Năm sinh",
                "Giới tính", "Địa chỉ", "Công việc");
        for (int i = 0; i < canbo.length; i++) {
            if (canbo[i] instanceof NhanVien) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", canbo[i].getHoTen(),
                        canbo[i].getNamSinh(), canbo[i].getGioiTinh(),
                        canbo[i].getDiaChi(), ((NhanVien) canbo[i]).getCongViec());
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Mời bạn nhập tuỳ chọn:");
        System.out.println("1. Nhập thông tin mới cho Cán Bộ");
        System.out.println("2. Tìm kiếm Cán Bộ theo họ tên");
        System.out.println("3. In ra thông tin Cán Bộ");
        System.out.println("4. Thoát chương trình");
        System.out.print("Lựa chọn: ");
        int luachon = sn.nextInt();
        System.out.print("Nhập vào số lượng Cán Bộ: ");
        int sl = sn.nextInt();
        Bai02 b2 = new Bai02(sl);
        sn.nextLine();
        switch (luachon) {
            case 1:
                System.out.println("Nhập thông tin mới cho cán bộ");
                b2.nhapTT();
                break;
            case 2:
                System.out.println("Tìm kiếm Cán Bộ theo họ tên");
                System.out.println("Chức năng đang được phát triển");
                System.out.println("Mời bạn quay lại sau!");
                break;
            case 3:
                System.out.println("In ra thông tin Cán Bộ");
                b2.xuatTT();
                break;
        }
        while (luachon != 4);
    }

}
