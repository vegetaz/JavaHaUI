/*
 * Ước số nguyên tố nhỏ nhất của n
 */
package btb12;

/**
 *
 * @author veget
 */
public class BTB12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 40;
        for (int i = 2; i <= n; i++) {
            int c = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if ((n % i == 0) && (c == 1)) {
                System.out.print("Ước số nguyên tố nhỏ nhất: " + i);
                break;
            }
        }
        System.out.println("");
    }

}
