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
public class sortI implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getId() > o1.getId()) {
            return 1;
        } else {
            return 0;
        }
    }

}
