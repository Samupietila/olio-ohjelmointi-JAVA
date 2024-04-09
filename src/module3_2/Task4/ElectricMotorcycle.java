package module3_2.Task4;

import java.util.Random;

public class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle(String type, String fuel, String otherInfo) {
        super(type, fuel, otherInfo);
    }

    @Override
    double calculateFuelEfficiency() {
        Random random = new Random();
        return (random.nextDouble() * 10) + 15;
    }

    @Override
    public void start(){
        System.out.println(getType() + " is starting...");
        setDrivedMeters();
    }


    @Override
    public void stop() {
        System.out.println(getType()+" is stopping...");
    }

    @Override
    public void getInfo() {
        System.out.println(getType() + " Information:");
        System.out.println("Type: " + getType());
        System.out.println("Fuel: " + getFuel());
        System.out.println("Color: " + getOtherInfo());
        System.out.println("Driven kilometers: " + getDrivedMeters() / 1000);
        System.out.println("Fuel effieciency: " + calculateFuelEfficiency()+ " kWh/100km");

    }

}
