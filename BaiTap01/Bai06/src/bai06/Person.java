/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai06;

/**
 *
 * @author veget
 */
public class Person {
    private String name;
    private String dob;
    private String address;
    private String gender;

    public Person() {
    }

    public Person(String name, String dob, String address, String gender) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", dob=" + dob + ", address=" + address + ", gender=" + gender + '}';
    }
    
}
