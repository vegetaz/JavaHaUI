/*
 * Trong các số tự nhiên nhỏ hơn 100, hãy đếm có bao nhiêu số
 * - Chia hết cho 5
 * - Chia 5 dư 1
 * - Chia 5 dư 2
 * - Chia 5 dư 3
 */
package btb11;

/**
 *
 * @author veget
 */
public class BTB11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d0 = 0;
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        for (int i = 5; i <= 100; i++) {
            switch (i % 5) {
                case 0:
                    d0++;
                    break;
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
            }
        }
        System.out.println("Các số chia hết cho 5: " + d0);
        System.out.println("Các số chia cho 5 du 1: " + d1);
        System.out.println("Các số chia cho 5 du 2: " + d2);
        System.out.println("Các số chia cho 5 du 3: " + d3);
    }

}
