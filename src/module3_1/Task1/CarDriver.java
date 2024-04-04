package module3_1.Task1;

public class CarDriver {

    public static void main(String[] args) {
        Car myCar;
        Supercar dreamCar;

        myCar = new Car("Toyota Corolla", 60, 120);
        dreamCar = new Supercar("Some Supercar", 9999,400);
        myCar.fillTank();
        dreamCar.fillTank();
        System.out.println("My car details: ");
        System.out.println("Car: " + myCar.getTypeName());
        System.out.println("Gasoline tank capacity: " + myCar.getGasolineTankCpacity() + "l, and  current gasoline level: " + myCar.getGasolineLevel() + "l");
        System.out.println("Current speed: " + myCar.getSpeed() + "km/h, and the top speed: " + myCar.getTopSpeed() + "km/h");
        System.out.println(" ");
        System.out.println("Dream car details:");
        System.out.println("Car: " + dreamCar.getTypeName());
        System.out.println("Gasoline tank capacity: " + dreamCar.getGasolineTankCpacity() + "l, and  current gasoline level: " + dreamCar.getGasolineLevel() + "l");
        System.out.println("Current speed: " + dreamCar.getSpeed() + "km/h, and the top speed: " + dreamCar.getTopSpeed() + "km/h");

        for (int i = 0; i < myCar.getTopSpeed()/ 10; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            System.out.println("My car gasoline level: "+myCar.getGasolineLevel());
            System.out.println();
            dreamCar.accelerate();
            System.out.println(dreamCar.getTypeName() + ": speed is " + dreamCar.getSpeed() + " km/h");
            System.out.println("My car gasoline level: "+dreamCar.getGasolineLevel());
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            dreamCar.decelerate(15);
            System.out.println(dreamCar.getTypeName() + ": speed is " + dreamCar.getSpeed() + " km/h");
        }
    }
}
