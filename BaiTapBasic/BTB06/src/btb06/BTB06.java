/*
 * In ra màn hình 15 số nguyên tố đầu tiên
 * 
 */
package btb06;

/**
 *
 * @author Vegetaz
 */
public class BTB06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k = 0;
        int n;
        int dem;
        int j = 0;
        while (j < 15) {
            k++;
            dem = 0;
            for (n = 2; n < k; n++) {
                if (k % n == 0) {
                    dem++;
                }
            }
            if (dem == 1) {
                System.out.println(k + " ");
                j++;
            }
        }
    }
}
