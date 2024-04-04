package module3_1.Task4;

public class Shape {

    private String color;

    public Shape (String color){
        this.color = color;
    }

    public double calculateArea(){
        return 0;
    }

    public String getShapeInfo() {
        return color;
    }

    public String getShapeColor() {
        return color + " ";
    }
}
