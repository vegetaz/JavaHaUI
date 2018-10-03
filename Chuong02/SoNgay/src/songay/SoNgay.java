/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songay;
import java.util.Scanner;
/**
 *
 * @author veget
 */
public class SoNgay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int thang;
        int nam;
        
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Tháng: ");
        thang = sn.nextInt();
        System.out.print("Năm: ");
        nam = sn.nextInt();
        
        switch(thang) {
            case 1: case 3: case 5: case 7: case 10: case 12:
                System.out.println("Tháng " + thang + " năm " + nam + " có 31 ngày!");
                break;
            case 4: case 6: case 9: case 11: 
		System.out.println("Tháng " + thang + " năm " + nam + " có 30 ngày!");
                break;
            case 2:	
		if ((nam % 4) == 0){
                     System.out.println("Tháng " + thang + " năm " + nam + " có 29 ngày!");
                }
		else
                    System.out.println("Tháng " + thang + " năm " + nam + " có 28 ngày!");
                break;
            default:
                    System.out.println ("Tháng hoặc năm nhập vào không hợp lệ!");

        }
    }
    
}
