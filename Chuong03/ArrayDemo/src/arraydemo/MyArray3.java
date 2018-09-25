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
public class MyArray3 extends MyArray2 {
    public MyArray3(int[] arr) {
        super(arr);
    }
    public void add(int arr[]){
        if((n+arr.length)>=maxN){
            System.out.println("Không đủ chỗ chứa cho mảng thêm");
        }
        else{//đủ chỗ
            for(int i=0;i<arr.length;i++){
                a[n] = arr[i];
                n++;
            }
            
        }
    }
    public void remove(int i){
        //i = i>=0?i:0;
        if(i>=n){
            System.out.println("Ví trí xóa không hợp lệ");
        }
        else{//xóa phần tử tại vị trí i
            for(int j=i;j<n-1;j++){
                a[j]=a[j+1];
            }
            n--;//giảm số phần tử của mảng đi 1
        }
                
    }
    public void removeAll(int x){
        int i = 0;
        
        while(i<n){
            if(a[i]==x){
                remove(i);
                
            }
            else{
                i++;
            }
        }
    }
    public int indexOf(int x){
        for(int i=0;i<n;i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    } 
    public int lastIndexOf(int x){
        for(int i = n-1;i>=0;i--){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    }
    
}
