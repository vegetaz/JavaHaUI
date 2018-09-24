/*
 * In ra các số chia hết cho 3, 5, 7 và nằm trong khoảng [1000, 2000]
 */
package btb09;

/**
 *
 * @author veget
 */
public class BTB09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int n = 2000;
        for (i = 1000; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

}
