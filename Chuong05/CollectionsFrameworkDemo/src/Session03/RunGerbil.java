/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session03;
import java.util.*;
/**
 *
 * @author Vegetaz
 */
class Dog {
}

class Gerbil {
  private static int gerbilCounter = 0;
  private int gerbilNumber = ++gerbilCounter;
  @Override
  public String toString() {
    return "gerbil " + gerbilNumber;
  }
  public void hop() {
    System.out.println(toString()
      + " is hopping");
  }
}
public class RunGerbil {
    public static void main(String args[]) {
    ArrayList gerbils = new ArrayList();
    for(int i = 0; i < 10; i++)
      gerbils.add(new Gerbil());
      gerbils.add(new Dog());
    for(int i = 0; i < gerbils.size(); i++)
      ((Gerbil)gerbils.get(i)).hop();
  }
}
