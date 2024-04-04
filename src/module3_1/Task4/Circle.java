package module3_1.Task4;

public class Circle extends Shape {
    private double radius;
    private String shapeName;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.shapeName = "Circle";

    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String getShapeInfo() {
        return getShapeColor() + shapeName + " with radius " + radius + ": ";
    }
}