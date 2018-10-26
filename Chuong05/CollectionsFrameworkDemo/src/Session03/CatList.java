/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session03;

import java.util.ArrayList;

/**
 *
 * @author Vegetaz
 */
class Catlist {

    private int catNumber;

    Catlist(int i) {
        catNumber = i;
    }

    void print() {
        System.out.println("Cat # " + catNumber);
    }
}

public class CatList {

    private ArrayList list = new ArrayList();

    public void add(Cat c) {
        list.add(c);
    }

    public int size() {
        return list.size();
    }

    public Cat get(int index) {
        return (Cat) list.get(index);
    }

    public static void main(String args[]) {
        CatList cat = new CatList();
        for (int i = 0; i < 6; i++) {
            cat.add(new Cat(i));
        }

        for (int i = 0; i < cat.size(); i++) {
            (cat.get(i)).print();
        }

    }
}
