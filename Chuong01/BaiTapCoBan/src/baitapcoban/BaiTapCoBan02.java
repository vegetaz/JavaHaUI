/*
 * Khai báo một mảng số nguyên gồm 5 phần tử sau đó in các phần tử ra màn hình
 */
package baitapcoban;

/**
 *
 * @author Vegetaz
 */
public class BaiTapCoBan02 {

    //
    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 25;
        a[1] = 10;
        a[2] = 19;
        a[3] = 89;
        a[4] = 67;
        //
        int l = a.length;
        System.out.println("Các phần tử trong mảng:");
        for (int i = 0; i < l; i++) {
            System.out.println("a[" + i + "]: " + a[i]);
        }
    }

}
