import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// sử dụng nextLine() => trả về kết quả một chuỗi
		System.out.print("Nhập vào họ và tên  : ");
		String fullname1 = input.nextLine();
		System.out.println("Họ tên bạn vừa nhập vào sử dụng method nextLine : "+fullname1);
		// sử dụng next() =>
		//Trả về kết quả nội dung trước khoảng trắng
		System.out.print("Nhập vào họ và tên  : ");
		String fullname2 = input.next();
		System.out.println();
		System.out.println("Họ tên bạn vừa nhập vào sử dụng method next : "+fullname2);

	}

}
