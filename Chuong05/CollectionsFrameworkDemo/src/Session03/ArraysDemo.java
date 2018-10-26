/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

/**
 *
 * @author Vegetaz
 */
class ArraysDemo {

    public ArraysDemo() {
        // allocate and initializa an array
        List myList = new ArrayList();
        int myArray[] = new int[10];
        Arrays.asList(myList);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = -3 * i;
        }
        System.out.println("Original contents: ");
        display(myArray);
        Arrays.sort(myArray);
        System.out.println("sorted: ");
        display(myArray);
        // fill and display
        Arrays.fill(myArray, 2, 6, -1);
        System.out.print("After fill() : ");
        display(myArray);
        // sort and display
        Arrays.sort(myArray);
        System.out.print("After sorting again: ");
        display(myArray);
        // binary search for -9
        System.out.print("The value -9 is at location ");
        int index = myArray.binarySearch(myArray, -9);
        System.out.println(index);
    }

    static void display(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        ArraysDemo arrd = new ArraysDemo();
    }
}
