package module3_1.Task1;

public class Supercar extends Car {
    public Supercar(String typeName, double gasolineTankCapacity, double topSpeed) {
        super(typeName, gasolineTankCapacity, topSpeed);
        setSpeed(0);
        setGasolineLevel(0);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            setGasolineLevel(getGasolineLevel()-5);
            if (getSpeed() < getTopSpeed())
                setSpeed(getSpeed() + 30);
            else
                System.out.println("Car cannot accelerate anymore :( .");
        } else
            setSpeed(0);
    }
}
