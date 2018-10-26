/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Session03;
/**
 *
 * @author Vegetaz
 */
public class TestHashCode {
    public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("OK");
		StringBuffer s2 = new StringBuffer("OK");
		System.out.println("Hash code of s1 = " + s1.hashCode());
		System.out.println("Hash code of s2 = " + s2.hashCode());
	}
}
