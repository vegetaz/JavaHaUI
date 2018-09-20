/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chenptvaomang;

import java.util.Scanner;

/**
 *
 * @author Vegetaz
 */
public class ArrayCommon {
    private int n; //Khai báo số phần tử của mảng
   
    Scanner sn = new Scanner(System.in);

    public ArrayCommon() {//Constructor không đối số
    }

    public void nhapIn() {
        System.out.print("Nhập vào số phần tử của mảng: ");
        n = sn.nextInt();
        int arr[] = new int[n];        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + ": ");
            arr[i] = sn.nextInt();
        }
        System.out.print("Mảng đã nhập là: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
