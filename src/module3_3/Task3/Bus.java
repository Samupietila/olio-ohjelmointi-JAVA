package module3_3.Task3;

public class Bus extends AbstractVehicle {
    public Bus(String type, String fuel, String otherInfo) {
        super(type, fuel, otherInfo);
    }

    @Override
    public void start(){
        System.out.println(getType() + " is starting...");
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
        System.out.println("Capacity: " + getOtherInfo() + " passengers");
    }

}

