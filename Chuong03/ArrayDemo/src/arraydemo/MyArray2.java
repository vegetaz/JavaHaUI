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
public class MyArray2 extends MyArray1 {

    
    public MyArray2(int arr[]) {
        super(arr);
    }
    @Override
    public void add(int x){//them vao dau
        super.add(x,0);//gọi phương thức của lớp cha
    }
   
    
}
