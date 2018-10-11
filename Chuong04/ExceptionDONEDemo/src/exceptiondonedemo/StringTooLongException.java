/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondonedemo;

/**
 *
 * @author veget
 */
public class StringTooLongException extends Exception {

    public StringTooLongException() {
    }

    public StringTooLongException(String message) {
        super(message);
    }

}
