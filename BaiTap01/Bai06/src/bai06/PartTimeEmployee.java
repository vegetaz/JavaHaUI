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
public class PartTimeEmployee extends Employee {
    private Integer hoursPerWeek;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(Integer hoursPerWeek, String employerName, String dateHired, String name, String dob, String address, String gender) {
        super(employerName, dateHired, name, dob, address, gender);
        this.hoursPerWeek = hoursPerWeek;
    }

    public Integer getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(Integer hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public String toString() {
        return "Thông tin cộng tác viên: " + "\nHọ tên: " + super.getName() + 
                "\nNgày sinh: " + super.getDob() + "\nĐịa chỉ: " + 
                super.getAddress() + "\nGiới tính: " + super.getGender() + 
                "\nSố giờ làm một tuần: " + hoursPerWeek;
    }
    
}
