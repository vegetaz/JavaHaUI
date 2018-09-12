import java.util.Scanner;
public class NT {
	private int ngay;
	private int thang;
	private int nam;
	//Phương thức khởi tạo không đối số!
	public NT() {
		
	}
	//Phương thức khởi tạo có đối số!
	public NT(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	//GETTER
	public int getNgay() {
		return ngay;
	}
	public int getThang() {
		return thang;
	}
	public int getNam() {
		return nam;
	}
	//SETTER
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	//toString
	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}
	//void nhap()
	public void nhap() {
		Scanner sn = new Scanner(System.in);
		System.out.print("Ngày: ");
		ngay = sn.nextInt();
		System.out.print("Tháng: ");
		thang = sn.nextInt();
		System.out.print("Năm: ");
		nam = sn.nextInt();
	}
}
