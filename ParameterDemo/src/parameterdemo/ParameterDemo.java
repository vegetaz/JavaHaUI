/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameterdemo;

/**
 *
 * @author veget
 */
public class ParameterDemo {

    /**
     * @param args the command line arguments
     */
    static void Sort (int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    int t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }
        }
    }
    
    static void Output (int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] b = {3, 1, 9, 7, 8, 5, 6, 2, 4};
        ParameterDemo.Sort(b);
        ParameterDemo.Output(b);
    }
    
}
