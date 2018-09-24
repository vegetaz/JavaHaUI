/*
 * In ra màn hình các số nguyên tố từ 1000 tới 2000
 */
package btb07;

/**
 *
 * @author veget
 */
public class BTB07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k;
        int n;
        int dem;
        for (k = 1000; k <= 2000; k++) {
            dem = 0;
            for (n = 2; n <= k; n++) {
                if (k % n == 0) {
                    dem++;
                }
            }
            if (dem == 1) {
                System.out.println(k);
            }
        }
    }

}
