package study.java.jonckers;
import java.util.Scanner;

public class Person {
	private String ten;
	private int cmnd;
	private DateTime dob;
	//Constructor không đối số
	public Person() {
		//
	}
	public Person(String ten, int cmnd, DateTime dob) {
		this.ten = ten;
		this.cmnd = cmnd;
		this.dob = dob;
	}
	//getter
	public String getTen() {
		return ten;
	}
	public int getCmnd() {
		return cmnd;
	}
	public DateTime getDob() {
		return dob;
	}
	//setter
	public void setName(String ten) {
		this.ten = ten;
	}
	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}
	public void setDob(DateTime dob) {
		this.dob = dob;
	}
	//Hàm nhập
	public void nhap() {
		Scanner sn = new Scanner(System.in);
		System.out.print("Tên: ");
		ten = sn.nextLine();
		System.out.print("Số CMND: ");
		cmnd = sn.nextInt();
		System.out.println("DOB");
		DateTime dob = new DateTime();
		dob.nhap();
	}
	//Xuất
	public void xuat() {
		System.out.println("Tên: " + ten);
		System.out.println("Số CMND: " + cmnd);
		System.out.println("Ngày sinh: " + dob);
	}
}
