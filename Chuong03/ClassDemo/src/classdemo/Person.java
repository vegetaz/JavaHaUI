/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;

/**
 *
 * @author veget
 */
public class Person {
    private int id;
    private String name;
    private String gender;
    private String dob; //Date of birth
    private String address;
    
    //Phương thức khởi tạo không có đối số
    public Person(){
        //Không có đối số!
    }
    
    //Phương thức khởi tạo có đối số
    public Person(int id, String name, String gender, String dob, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
    }
    
    //Phương thức truy cập getter và setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    //Phương thức toString
    @Override
    public String toString() {
        return "\nid: " + id + "\nTên: " + name + "\nGiới tính: " + gender + "\nNgày sinh: " + dob + "\nĐịa chỉ: " + address;
    }
    
}
