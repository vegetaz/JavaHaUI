import java.util.Scanner;

public class XinChao {

	public static void main(String[] args) {
		String ten;
		char c;
		int tuoi;
		var sn = new Scanner(System.in);
		System.out.print("Xin Chào! Nhập họ và tên bạn: ");
		ten = sn.nextLine();
		System.out.print("Tuổi của bạn: ");
		tuoi = sn.nextInt();
		sn.nextLine();//Xoá bộ nhớ đệm ngu si
		System.out.print("Chữ cái đầu tiên trong tên của bạn: ");
		c = sn.nextLine().charAt(0);
		System.out.println("Chào bạn " + ten + " " + tuoi + " tuổi " + c);
	}

}
