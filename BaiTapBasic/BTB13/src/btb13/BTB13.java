/*
 * In ra khai triển thành tích các số nguyên tố từ nhỏ tới lớn
 */
package btb13;

/**
 *
 * @author veget
 */
public class BTB13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 100;
        int i = 2;
        while (i <= n) {
            for (i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                    n = n / i;
                    break;
                }
            }
        }
        System.out.println("");
    }

}
