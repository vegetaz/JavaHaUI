//In ra màn hình tất cả các hợp số nhỏ hơn 100.
//Hợp số là một số tự nhiên có thể biểu diễn thành tích của hai số tự nhiên 
//khác nhỏ hơn nó. Một định nghĩa khác tương đương: hợp số là số chia hết cho 
//các số khác ngoài 1 và chính nó.
package btb05;

/**
 *
 * @author Vegetaz
 */
public class BTB05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k;
        int n;
        int dem;
        for (k = 1; k < 100; k++) {
            dem = 0;
            for (n = 2; n <= k; n++) {
                if(k % n == 0) {
                    dem++;
                }
            }
            if (dem > 1) {
                System.out.println("Hợp số là: " + k);
            }
        }
    }
    
}
