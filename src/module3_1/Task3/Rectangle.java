package module3_1.Task3;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(String shapeName, double width, double height){
        super(shapeName);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String getShapeInfo() {
        return getShapeName() + " with width " + width + " and height " + height + ": ";
    }
}
