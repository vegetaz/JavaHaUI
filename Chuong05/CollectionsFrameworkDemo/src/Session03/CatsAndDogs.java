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
class Catsanddogs {

    private int catNumber;

    Catsanddogs(int i) {
        catNumber = i;
    }

    void print() {
        System.out.println("Cat #" + catNumber);
    }
} ///:~

class Dog {

    private int dogNumber;

    Dog(int i) {
        dogNumber = i;
    }

    void print() {
        System.out.println("Dog #" + dogNumber);
    }
}

class Cat {

    private int dogNumber;

    Cat(int i) {
        dogNumber = i;
    }

    void print() {
        System.out.println("Cat #" + dogNumber);
    }
}

public class CatsAndDogs {

    public static void main(String[] args) {
        ArrayList cats = new ArrayList();
        for (int i = 0; i < 7; i++) {
            cats.add(new Cat(i));
        }
        // Not a problem to add a dog to cats:
        cats.add(new Dog(7));
        for (int i = 0; i < cats.size(); i++) {
            ((Cat) cats.get(i)).print();
        }
        // Dog is detected only at run-time
    }
} ///:~
