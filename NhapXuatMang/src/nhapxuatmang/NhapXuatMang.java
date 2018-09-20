package nhapxuatmang;
import java.util.Scanner;
/**
 *
 * @author Vegetaz
 */
public class NhapXuatMang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sn = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        n = sn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + i + ": ");
            a[i] = sn.nextInt();
        }
        System.out.print("Mảng đã nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println("");
    }
    
}
