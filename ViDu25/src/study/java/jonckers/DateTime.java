package study.java.jonckers;
import java.util.Scanner;
public class DateTime {
	private int ngay;
	private int thang;
	private int nam;
	//Constructor
	public DateTime() {
		//
	}
	public DateTime(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	//getter
	public int getNgay() {
		return ngay;
	}
	public int getThang() {
		return thang;
	}
	public int getNam() {
		return nam;
	}
	//setter
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	//Nhập
	public void nhap() {
		Scanner sn = new Scanner(System.in);
		System.out.print("Ngày: ");
		ngay = sn.nextInt();
		System.out.print("Tháng: ");
		thang = sn.nextInt();
		System.out.print("Năm: ");
		nam = sn.nextInt();
	}
	//toString - Xuất
	@Override
	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}
}
