package module3_1.Task4;

public class Rectangle extends Shape {
    private double width;
    private double height;
    private String shapeName;
    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
        this.shapeName = "Rectangle";
    }
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String getShapeInfo() {
        return getShapeColor() + shapeName + " with width " + width + " and height " + height + ": ";
    }
}
