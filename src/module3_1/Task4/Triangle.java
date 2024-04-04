package module3_1.Task4;

public class Triangle extends Shape {
    private double base;
    private double height;
    private String shapeName;

    public Triangle(String color, double base, double height){
        super(color);
        this.base = base;
        this.height = height;
        this.shapeName = "Triangle";
    }
    @Override
    public double calculateArea() {
        return 0.5 * (base * height);
    }
    @Override
    public String getShapeInfo() {
        return getShapeColor() + shapeName + " with base " + base + " and height " + height + ": ";
    }
}
