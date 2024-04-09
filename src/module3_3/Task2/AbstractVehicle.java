package module3_3.Task2;

abstract class AbstractVehicle implements Vehicle {
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
}
