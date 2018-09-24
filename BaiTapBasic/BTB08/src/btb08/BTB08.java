/*
 * In ra màn hình các số nhỏ hơn 100 và chia hết cho 3 và 7
 */
package btb08;

/**
 *
 * @author veget
 */
public class BTB08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 100;
        int i;
        for (i = 0; i < n; i++) {
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.print(i + " ");
            }
        }
    }

}
