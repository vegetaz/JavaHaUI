package abstractclassdemo;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author veget
 */
public class AbstractClassDemo {

    /**
     * @param args the command line arguments
     */
    NhanVien a[];

    public AbstractClassDemo(int n) {
        a = new NhanVien[n];//tao mang luu duoc n nhan vien
    }

    public void nhap() {//Nhap thong tin cho mang a
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Tên nhân viên thứ " + (i + 1) + ": ");
            String name = sn.nextLine();
            System.out.print("Năm vào làm của nhân viên thứ " + (i + 1) + ": ");
            int nvl = sn.nextInt();
            //xoa dau enter
            sn.nextLine();
            System.out.print("Loại nhân viên(1. NVSX 2. NVVP): ");
            int choice = sn.nextInt();
            switch (choice) {
                case 1://nhan vien san xuat
                    System.out.print("Số sản phẩm: ");
                    int ssp = sn.nextInt();
                    //xoa bo dem
                    sn.nextLine();
                    a[i] = new NVSX(ssp, name, nvl);
                    break;
                case 2://nhan vien van phong
                    System.out.print("Mức lương: ");
                    float ml = sn.nextFloat();
                    System.out.print("Số ngày nghỉ: ");
                    int snn = sn.nextInt();
                    sn.nextLine();
                    a[i] = new NVVP(ml, snn, name, nvl);
                    break;
            }
        }

    }

    public void xuat() {
        System.out.println("Danh sách nhân viên sản xuất");
        System.out.printf("%25s%20s%20s%20s%20s", "Họ và tên", "Năm vào làm", "Lương", "Thưởng", "Thu nhập");
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof NVSX) {
                System.out.printf("\n%25s%20d%20.2f%20.2f%20.2f", a[i].getHoTen(), a[i].getNamVaoLam(), a[i].tinhLuong(), a[i].tinhThuong(), a[i].tinhLuong() + a[i].tinhThuong());
            }
        }
        System.out.println("\nDanh sách nhân viên văn phòng");
        System.out.printf("%25s%20s%20s%20s%20s", "Họ và tên", "Năm vào làm", "Lương", "Thưởng", "Thu nhập");
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof NVVP) {
                System.out.printf("\n%25s%20d%20.2f%20.2f%20.2f", a[i].getHoTen(), a[i].getNamVaoLam(), a[i].tinhLuong(), a[i].tinhThuong(), a[i].tinhLuong() + a[i].tinhThuong());
            }
        }

    }

    public float tinhTongTien() {
        float sum = 0f;
        for (int i = 0; i < a.length; i++) {
            sum += a[i].tinhLuong() + a[i].tinhThuong();
        }
        return sum;
    }

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        AbstractClassDemo abd = new AbstractClassDemo(4);
        abd.nhap();
        abd.xuat();
        System.out.println("\nTổng tiền công ty phải trả: " + df.format(abd.tinhTongTien()));
    }

}
