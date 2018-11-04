/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test0203;

import java.util.Comparator;

/**
 *
 * @author Vegetaz
 */
public class sortC implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
//        Sắp xếp theo mã sinh viên giảm dần
//        return o2.getCode().compareTo(o1.getCode());
//        Sắp xếp theo mã sinh viên tăng dần
        return o1.getCode().compareTo(o2.getCode());
    }
}
