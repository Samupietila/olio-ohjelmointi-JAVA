package module3_3.Task1;

public class Motorcycle implements Vehicle {
    @Override
    public void start(){
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Motorcycle Information:");
        System.out.println("Type: Motorcycle");
        System.out.println("Fuel: Gasoline");
        System.out.println("Color: Black");
    }
}