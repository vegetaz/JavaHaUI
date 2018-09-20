/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdemo;

/**
 *
 * @author model
 */
public class Person {
    private int id;
    static int idnumber = 1000;
    private String name;
    private String dob;
    private String gender;
    private String address;

    public Person() {
    }
    public static int getIdNumber(){
        return idnumber;
    }
    public Person(String name, String dob, String gender, String address) {
        this.id = idnumber;
        idnumber++;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nid = " + id + "\nname = " + name + "\ndob = " + dob + "\ngender = " + gender + "\naddress = " + address ;
    }
    
    
    
}
