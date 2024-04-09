package module3_3.Task1;

public class Car implements Vehicle {
    @Override
    public void start(){
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Car Information:");
        System.out.println("Type: Car");
        System.out.println("Fuel: Petrol");
        System.out.println("Color: Red");
    }
}
