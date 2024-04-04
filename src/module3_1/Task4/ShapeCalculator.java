package module3_1.Task4;

import java.util.ArrayList;

public class ShapeCalculator {
    public static void main(String[] args) {
        Circle circle;
        Rectangle rectangle;
        Triangle triangle;
        circle = new Circle("Blue", 5);
        rectangle = new Rectangle("Red", 4, 6);
        triangle = new Triangle("Green", 3, 8);
        ArrayList<Shape> list = new ArrayList<>();
        list.add(circle);
        list.add(rectangle);
        list.add(triangle);

        for (Shape i : list) {
            System.out.println("Area of " + i.getShapeInfo() + i.calculateArea());
        }

    }
}
