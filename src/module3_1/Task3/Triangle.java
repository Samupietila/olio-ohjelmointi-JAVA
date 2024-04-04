package module3_1.Task3;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String shapeName, double base, double height){
        super(shapeName);
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return 0.5 * (base * height);
    }
    @Override
    public String getShapeInfo() {
        return getShapeName() + " with base " + base + " and height " + height + ": ";
    }
}
