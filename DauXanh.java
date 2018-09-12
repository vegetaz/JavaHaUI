import java.util.Scanner;
public class DauXanh {
	Scanner sn = new Scanner(System.in);
	String ten;
	public static void main(String[] args){
		System.out.println("Xin chao! Ten ban la gi: ");
		ten = sn.nextLine();
		System.out.println("Chao ban " + ten);
	}
}