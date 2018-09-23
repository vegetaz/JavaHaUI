//Hình Tròn
package bai09;

/**
 *
 * @author veget
 */
public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle() {
    }

    public Triangle(int base, int height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        float area = 0f;
        area = (float) 0.5 * base * height;
        return area;
    }

    @Override
    public String toString() {
        return "Diện tích tam giác là: " + getArea();
    }
}
