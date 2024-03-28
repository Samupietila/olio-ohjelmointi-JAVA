package module2_1.Task2;

public class Car {

    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double gasolineTankCpacity;
    private double topSpeed;

    public Car(String typeName, double gasolineTankCapacity, double topSpeed) {
        speed = 0; gasolineLevel = 0;
        this.typeName = typeName;
        this.gasolineTankCpacity = gasolineTankCapacity;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = gasolineTankCpacity;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }
    double getGasolineTankCpacity(){
        return gasolineTankCpacity;
    }

    public double getTopSpeed() {
        return topSpeed;
    }
}