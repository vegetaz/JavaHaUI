/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nvdemo;
import java.util.Scanner;
/**
 *
 * @author veget
 */
public class NV {
    private String firstName;
    private String lastName;
    private NT dateOfBirth;
    private NT dateOfStartWork;
    Scanner sn = new Scanner(System.in);
    //Phương thức khởi tạo không đối số
    public NV() {
        //
    }
    //Phương thức khởi tạo có đối số
    public NV(String firstName, String lastName, NT dateOfBirth, NT dateOfStartWork) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfStartWork = dateOfStartWork;
    }
    //GETTER
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public NT getDateOfBirth() {
        return dateOfBirth;
    }
    public NT getDateOfStartWork() {
        return dateOfStartWork;
    }
    //SETTER
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setDateOfBirth(NT dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setDateOfStartWork(NT dateOfStartWork) {
        this.dateOfStartWork = dateOfStartWork;
    }
    //Không cần toString
    void nhap() {
        System.out.print("Họ đệm: ");
        firstName = sn.nextLine();
        System.out.print("Tên: ");
        lastName = sn.nextLine();
        System.out.println("Ngày sinh: ");
        dateOfBirth = new NT();
        dateOfBirth.nhap();
        System.out.println("Ngày vào làm: ");
        dateOfStartWork = new NT();
        dateOfStartWork.nhap();
    }
    public static void OutTitle() {
        System.out.printf("%25s%25s%25s%25s\n", "Họ và tên đệm", "Tên", "Ngày sinh", "Ngày vào làm");
    }
    public void xuat() {
        System.out.printf("%25s%25s%25s%25s\n", firstName, lastName, dateOfBirth, dateOfStartWork);
    }
}
