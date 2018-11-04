/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test0203;

/**
 *
 * @author Vegetaz
 */
public class Student {

    private int id;
    private String code;
    private String name;
    private String dob;
    private String gender;
    private String pob;
    private float avgmark;

    public Student() {
    }

    public Student(int id, String code, String name, String dob, String gender, String pob, float avgmark) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.pob = pob;
        this.avgmark = avgmark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public float getAvgmark() {
        return avgmark;
    }

    public void setAvgmark(float avgmark) {
        this.avgmark = avgmark;
    }

    @Override
    public String toString() {
//        return "Student{" + "id=" + id + ", code=" + code + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", pob=" + pob + ", avgmark=" + avgmark + '}';
        return String.format("%-12s%-15s%-22s%-12s%-11s%-22s%-16s", id, code,
                name, dob, gender, pob, avgmark);
    }

}
