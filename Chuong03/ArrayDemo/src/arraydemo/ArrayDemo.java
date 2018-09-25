/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

/**
 *
 * @author nghien
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        MyArray1 o1 = new MyArray1(arr);
        System.out.println("Mảng ban đầu:");
        o1.outPut();
        o1.add(7);
        System.out.println("Mảng sau khi thêm 7 vào cuối");
        o1.outPut();
        
        o1.add(8,2);
        System.out.println("Mảng thêm 8 vào vị trí 2");
        o1.outPut();
        o1 = new MyArray2(arr);
        System.out.println("Mảng ban đầu của MyArray2");
        o1.outPut();
        
        o1.add(7);
        System.out.println("Mảng sau khi thêm 7 vào đầu");
        o1.outPut();
        MyArray3 o2 = new MyArray3(arr);
        System.out.println("Mảng ban đầu của MyArray3");
        o2.outPut();
        int arr1[] = {9,9,10,9,11};
        o2.add(arr1);
        System.out.println("Mảng sau khi thêm vào cuối một mảng khác");
        o2.outPut();
        o2.remove(3);
        System.out.println("Mảng sau khi xóa phần tử tại vị trí 3 (tính từ 0)");
        o2.outPut();
        o2.removeAll(9);
        System.out.println("Mảng sau khi xóa tất cả các phần tử = 9");
        o2.outPut();
        int i = o2.indexOf(2);
        if(i==-1){
            System.out.println("Không tim thấy phần tử bằng 2");
        }
        else{
            System.out.println("Tìm thấy phần tử bằng 2 tại vị trí: "+i);
        }
        
    }
    
}
