package module3_3.Task4;

public class VehicleDemo {
    private static void demo(ElectricVehicle vehicle) {
        vehicle.charge();
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
        System.out.println();
        demo(new ElectricCar("Electric Car", "Electricity", "Grey"));
        System.out.println();
        demo(new ElectricMotorcycle("Electric Motorcycle", "Electricity", "Blue"));
    }
}
