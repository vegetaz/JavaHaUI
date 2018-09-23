//Hình Chữ Nhật
package bai09;

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
