package RectangleExample;

public class Rectangle {
    // State: properties, fields, data
    double length;
    double width;
    String color;

    // CONSTRUCTORS: special methods to create objects

    public Rectangle() {
        length = 1;
        width = 1;
        color = "blue";
    }

    public Rectangle(double len, double wid, String col) {
        length = len;
        width = wid;
        color = col;
    }

    public Rectangle(double len, double wid) {
        length = len;
        width = wid;
        color = "yellow";
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}
