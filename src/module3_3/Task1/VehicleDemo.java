package module3_3.Task1;

public class VehicleDemo {
    private static void demo(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
        vehicle.getInfo();
    }
    public static void main(String[] args) {
        demo(new Car());
        System.out.println();
        demo(new Motorcycle());
        System.out.println(3);
        demo(new Bus());
    }
}
