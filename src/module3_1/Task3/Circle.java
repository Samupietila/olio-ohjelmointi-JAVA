package module3_1.Task3;

public class Circle extends Shape {
    private double radius;
    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;

    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String getShapeInfo() {
        return getShapeName() + " with radius " + radius + ": ";
    }
}