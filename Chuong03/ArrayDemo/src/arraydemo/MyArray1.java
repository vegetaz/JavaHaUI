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
public class MyArray1 {
    int n;
    int a[];//khai báo mảng
    int maxN;

    public MyArray1(int arr[]) {
        n = arr.length;
        maxN  = 2*n;
        a = new int[maxN];//tạo ra mảng
        for(int i=0;i<n;i++){
            a[i] = arr[i];
        }
    }
    public void outPut(){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println("");//xuống dòng
    }
    public void add(int x){//thêm phần tử vào cuối mảng a
        if(n==maxN){
            System.out.println("Mảng đầy rồi không thêm được nữa");
        }
        else{//Mảng chưa đầy
           a[n] = x;
           n++;
        }
    }
    public void add(int x,int i){
        //thêm phần tử x vào vị trí i
        if(n==maxN){
            System.out.println("Mảng đầy rồi không thêm được");
        }
        else{
            //Dãn dẫy
            for(int j=n-1;j>=i;j--){
                a[j+1] = a[j];
            }
            //chèn
            a[i] = x;
            //tăng số phần tử lên 1
            n++;
        }
    }
    
    
}
