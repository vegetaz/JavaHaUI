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
public class sortN implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
//        Sắp xếp theo tên giảm dần
        return o2.getName().compareTo(o1.getName());
//        Sắp xếp theo tên tăng dần
//        return o1.getName().compareTo(o2.getName());
//        String name1 = o1.getName().substring(o1.getName().lastIndexOf(" "));
//        String name2 = o2.getName().substring(o2.getName().lastIndexOf(" "));
//        return name1.compareTo(name2);
    }
}
