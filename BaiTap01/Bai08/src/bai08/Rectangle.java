/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai08;

/**
 *
 * @author veget
 */
public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        float area = 0f;
        area = (float) length * width;
        return area;
    }

    @Override
    public String toString() {
        return "Diện tích hình chữ nhật là: " + getArea();
    }

}
