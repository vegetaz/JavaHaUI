/*
 * In ra màn hình 5 số hoàn hảo đầu tiên
 */
package btb10;

/**
 *
 * @author veget
 */
public class BTB10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;
        int i = 0;
        int j;
        int s;
        while (i < 5) {
            n++;
            s = 1;
            for (j = 2; j < n; j++) {
                if (n % j == 0) {
                    s += n;
                }
            }
            if (n == s) {
                System.out.print(n + " ");
                i++;
            }
        }
        System.out.println("");
    }

}
