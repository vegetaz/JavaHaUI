/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdemo;

/**
 *
 * @author Vegetaz
 */
public class Student {

    private int id;
    private String name;
    private int msv;

    public Student() {
    }

    public Student(int id, String name, int msv) {
        this.id = id;
        this.name = name;
        this.msv = msv;
    }

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

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    @Override
    public String toString() {
        return String.format("%-9s%-25s%-15s", id, name, msv);
    }
}
