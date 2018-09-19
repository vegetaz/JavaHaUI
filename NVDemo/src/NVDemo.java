import java.util.Scanner;
public class NVDemo {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n;
		NV danhSachNV[]; //Khai báo mảng nhân viên
		System.out.print("Số lượng nhân viên: ");
		n = sn.nextInt();
		danhSachNV =  new NV[n]; //Xin cấp phát mảng
		System.out.println("Chi tiết nhân viên!");
		for (int i = 0; i < n; i++) {
			danhSachNV[i] = new NV(); //Xin cấp phát đối tượng
			danhSachNV[i].nhap();
		}
		System.out.println("Danh sách nhân viên sau khi nhập: ");
		NV.xuatTieuDe();
		for (int i = 0; i < n; i++) {
			danhSachNV[i].xuat();
		}
	}

}
