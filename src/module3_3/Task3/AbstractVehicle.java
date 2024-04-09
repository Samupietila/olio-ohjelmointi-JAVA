package module3_3.Task3;

import java.util.Objects;

abstract class AbstractVehicle implements ElectricVehicle{
    protected String type;
    protected String fuel;
    protected String otherInfo;

    public AbstractVehicle(String type, String fuel, String otherInfo){
        this.type = type;
        this.fuel = fuel;
        this.otherInfo = otherInfo;
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
            System.out.println("No possible to charge.");
        }
        else
            System.out.println(getType() + " charged to the MAX");
    }
}
