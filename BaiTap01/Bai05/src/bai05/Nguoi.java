/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai05;

/**
 *
 * @author veget
 */
public class Nguoi {
    private String name;
    private int age;
    private char gender;

    public Nguoi() {
    }

    public Nguoi(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
    
}
