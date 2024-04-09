package module3_2.Task1;

public class Bus implements Vehicle {
    @Override
    public void start(){
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus Information:");
        System.out.println("Type: Bus");
        System.out.println("Fuel: Diesel");
        System.out.println("Capacity: 40 Passengers");
    }
}
