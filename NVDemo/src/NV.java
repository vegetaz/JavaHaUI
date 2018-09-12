import java.util.Scanner;
public class NV {
	private String hoDem;
	private String ten;
	private NT ngaySinh;
	private NT ngayVaoLam;
	//Phương thức khởi tạo không đối số
	public NV() {
		//Không có đối thị số
	}
	//Phương thức khởi tạo có đối số
	public NV(String hoDem, String ten, NT ngaySinh, NT ngayVaoLam) {
		this.hoDem = hoDem;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.ngayVaoLam = ngayVaoLam;
	}
	//GETTER
	public String getHoDem() {
		return hoDem;
	}
	public String getTen() {
		return ten;
	}
	public NT getNgaySinh() {
		return ngaySinh;
	}
	public NT getNgayVaoLam() {
		return ngayVaoLam;
	}
	//SETTER
	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setNgaySinh(NT ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public void setNgayVaoLam(NT ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}
	//toString
/*	public String toString() {
		return ;
	}*/
	public void nhap() {
		Scanner sn = new Scanner(System.in);
		System.out.print("Nhập vào họ đệm: ");
		hoDem = sn.nextLine();
		System.out.print("Nhập vào tên: ");
		ten = sn.nextLine();
		System.out.println("ngày/tháng/năm sinh");
		ngaySinh = new NT();
		ngaySinh.nhap();
		System.out.println("ngày/tháng/năm vào làm");
		ngayVaoLam = new NT();
		ngayVaoLam.nhap();
	}
	public static void xuatTieuDe() {
		System.out.printf("%25s%25s%25s%25s\n", "Họ đệm", "Tên", "Ngày sinh", "Ngày vào làm");
	}
	public void xuat() {
		System.out.printf("%25s%25s%25s%25s\n", hoDem, ten, ngaySinh, ngayVaoLam);
	}
}
