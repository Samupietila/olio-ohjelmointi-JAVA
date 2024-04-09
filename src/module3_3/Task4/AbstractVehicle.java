package module3_3.Task4;

import java.util.Objects;
import java.util.Random;

abstract class AbstractVehicle implements ElectricVehicle {
    protected String type;
    protected String fuel;
    protected String otherInfo;
    protected double drivedMeters;

    public AbstractVehicle(String type, String fuel, String otherInfo){
        this.type = type;
        this.fuel = fuel;
        this.otherInfo = otherInfo;
        this.drivedMeters = 0;
    }

    public String getFuel() {
        return fuel;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public String getType() {
        return type;
    }
    public void charge() {
        if(!Objects.equals(this.fuel, "Electricity")){
            System.out.println("Not possible to charge.");
        }
        else
            System.out.println(getType() + " charged to the MAX");
    }
    abstract double calculateFuelEfficiency();

    public double getDrivedMeters() {
        return drivedMeters;
    }

    public void setDrivedMeters() {
        this.drivedMeters += 100* 1000;
    }

}
