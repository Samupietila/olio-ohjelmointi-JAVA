package module2_1.Task2;

public class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 60, 120);
        myCar.fillTank();
        System.out.println("My car details: ");
        System.out.println("Car: " + myCar.getTypeName());
        System.out.println("Gasoline tank capacity: " + myCar.getGasolineTankCpacity() + "l, and  current gasoline level: " + myCar.getGasolineLevel() + "l");
        System.out.println("Current speed: " + myCar.getSpeed() + "km/h, and the top speed: " + myCar.getTopSpeed() + "km/h");

        for (int i = 0; i < myCar.getTopSpeed()/ 10; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");

        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
    }
}
