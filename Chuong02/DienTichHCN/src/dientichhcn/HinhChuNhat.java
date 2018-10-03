/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dientichhcn;

/**
 *
 * @author veget
 */
public class HinhChuNhat {
    private float cr;
    private float cd;
        
    //Phương thức khởi tạo không đối số
    public HinhChuNhat(){
        
    }
    //Phương thức khởi tạo có đối số
    public HinhChuNhat(float cr, float cd) {
        this.cr = cr;
        this.cd = cd;
    }
    
    //Phương thức truy cập
    public float getCr(){
        return this.cr;
    }
    public void setCr(float cr){
        this.cr = cr;
    }
    
    public float getCd(){
        return this.cd;
    }
    public void setCd(float cd){
        this.cd = cd;
    }

    public float DT(){
        return cr * cd; 
    }
    
    public float CV(){
        return (cr + cd) * 2; 
    }
    
    //Phương thức toString
    @Override
    public String toString(){
        return "Chiều rộng: " + cr + "\nChiều dài: " + cd + "\nDiện tích: " + DT() + "\nChu vi: " + CV();
    }
    
}
