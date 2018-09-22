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
public class Employee extends Person {
    private String employerName;
    private String dateHired;

    public Employee() {
    }

    public Employee(String employerName, String dateHired, String name, String dob, String address, String gender) {
        super(name, dob, address, gender);
        this.employerName = employerName;
        this.dateHired = dateHired;
    }

    public String getEmployerName() {
        return employerName;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" + "employerName=" + employerName + ", dateHired=" + dateHired + '}';
    }
    
}
