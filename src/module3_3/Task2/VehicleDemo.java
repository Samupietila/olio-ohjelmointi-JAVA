package module3_3.Task2;

public class VehicleDemo {
    private static void demo(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        vehicle.getInfo();
    }
    public static void main(String[] args) {
        demo(new Car("Car", "Petrol", "Red"));
        System.out.println();
        demo(new Motorcycle("Motorcycle", "Gasoline", "Black"));
        System.out.println();
        demo(new Bus("Bus", "Diesel", "40"));
    }
}
