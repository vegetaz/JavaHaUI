/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai01;

/**
 *
 * @author veget
 */
public class Person {
    private String name;
    private String dob;
    private String pob;
    private char gender;
    private String email;
    private String phone;
    
    public Person() {
        //
    }

    public Person(String name, String dob, String pob, char gender, String email, String phone) {
        this.name = name;
        this.dob = dob;
        this.pob = pob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getPob() {
        return pob;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person Information" + "\nFull name: " + name + "\nDate of birth: " + dob + "\nPlace of birth: " + pob 
                + "\nGender: " + gender + "\nEmail: " + email + "\nPhone number: " + phone;
    }
    
    
}
