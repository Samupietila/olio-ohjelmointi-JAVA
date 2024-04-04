package module3_1.Task2;

public class Car {

    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double gasolineTankCpacity;
    protected double topSpeed;

    public Car(String typeName, double gasolineTankCapacity, double topSpeed) {
        this.speed = 0; this.gasolineLevel = 0;
        this.typeName = typeName;
        this.gasolineTankCpacity = gasolineTankCapacity;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        if (gasolineLevel > 0){
            gasolineLevel -= 1;
            if (speed < topSpeed)
                speed += 10;
            else
                System.out.println("Car cannot accelerate anymore :( .");
        }
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

    public void setSpeed(double speed) {
        this.speed = speed;
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

    public void setGasolineLevel(double gasolineLevel) {
        this.gasolineLevel = gasolineLevel;
    }

    double getGasolineTankCpacity(){
        return gasolineTankCpacity;
    }

    public double getTopSpeed() {
        return topSpeed;
    }
}